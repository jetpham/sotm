package sotm;

public class Flywheel {
    public Flywheel() {
    }
    //public method to calculate velocity from rpm in meters per second
    public static double calculateCargoVelocity(double rpm) {
        double velocity = rpm * 2 * Math.PI;
        return velocity;
    }
    //public method to calculate angular velocity from rpm in radians per second
    public static double calculateCargoAngularvelocity(double rpm) {
        double velocity = rpm * 2 * Math.PI;
        return velocity;
    }
}
