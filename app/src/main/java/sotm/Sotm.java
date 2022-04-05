package sotm;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

public class Sotm {
    public static class BallPosVel {
        public Point3d pos;
        public Vector3d vel;

        public BallPosVel(Point3d pos, Vector3d vel) {
            this.pos = pos;
            this.vel = vel;
        }
    }

    /**
     * calculate the velocity of the ball initially after it has been shot
     *
     * @param turretAngle the angle of the turret in radians
     * @param hoodAngle   the angle of the hood in radians
     * @param velocity    the velocity of the ball in meters per second
     * @return initial velocity vector of the ball after being shot
     */
    public static Vector3d calculateInitialVelocity(double turretAngle, double hoodAngle, double velocity) {
        double xyradius = Math.sin(hoodAngle) * velocity;
        double x = Math.sin(turretAngle) * xyradius;
        double y = Math.cos(turretAngle) * xyradius;
        double z = Math.cos(hoodAngle) * velocity;
        Vector3d initialVelocity = new Vector3d(x, y, z);
        return initialVelocity;
    }

    public static Vector3d calculateAerodynamicForceVector(Vector3d ballVel, double cargoAngularVelocity) {
        Vector3d aerodynamicForceVector = new Vector3d();
        double aerodynamicForce = Constants.Aerodynamic.AERODYNAMIC_FORCE_COEFFICIENT * cargoAngularVelocity
                * cargoAngularVelocity;
        aerodynamicForceVector.scale(aerodynamicForce, ballVel);
        return aerodynamicForceVector;
    }

    public static BallPosVel calculateNextPosition(BallPosVel ballPosVel, double cargoAngularVelocity,
            double timeStep) {
        Point3d pos = ballPosVel.pos;
        Vector3d vel = ballPosVel.vel;
        pos.interpolate(vel, timeStep);
        return new BallPosVel(pos, vel);
    }
    // variable input: ball position, ball velocity
    // variable output: ball positoin when height is at goal height
    /*
     * ball positoin is in 3 dimentions and is represented by a vector
     * ball velocity is in 3 dimentions and is represented by a vector
     */
}
