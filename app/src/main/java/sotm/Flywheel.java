package sotm;

public class Flywheel {
    public Flywheel() {
    }

    // public method to calculate velocity from rpm in meters per second
    public static double calculateCargoVelocity(double rpm) {
        double backRollerRadsPerSecond = rpm * Constants.BackRoller.BACKROLLER_GEAR_RATIO;
        double flywheelRadsPerSecond = rpm * Constants.Flywheel.FLYWHEEL_GEAR_RATIO;
        double velocity = (backRollerRadsPerSecond * Constants.BackRoller.BACKROLLER_RADIUS * flywheelRadsPerSecond
                * Constants.Flywheel.FLYWHEEL_RADIUS) / (Constants.Cargo.CARGO_RADIUS);
        return velocity;
    }

    // public method to calculate angular velocity from rpm in radians per second
    public static double calculateCargoAngularVelocity(double rpm) {
        double backRollerRadsPerSecond = rpm * Constants.BackRoller.BACKROLLER_GEAR_RATIO;
        double flywheelRadsPerSecond = rpm * Constants.Flywheel.FLYWHEEL_GEAR_RATIO;
        double AngularVelocity = ((flywheelRadsPerSecond * Constants.Flywheel.FLYWHEEL_RADIUS)
                - (backRollerRadsPerSecond * Constants.BackRoller.BACKROLLER_RADIUS)) / 2;
        return AngularVelocity;
    }
}
