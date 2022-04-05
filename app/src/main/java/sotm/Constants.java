package sotm;

public final class Constants {
    /*
     * all constants are in SI units
     */
    public final class Flywheel {
        public static final double FLYWHEEL_RADIUS = 0.0508001016002;
        public static final double FLYWHEEL_FRICTION_COEFFICIENT = .98; // TODO: find actual value
        public static final double FLYWHEEL_MASS = 0.0025; // TODO: find actual value
        public static final double FLYWHEEL_GEAR_RATIO = 2 / 3;
    }

    public final class BackRoller {
        public static final double BACKROLLER_RADIUS = 0.1206502413;
        public static final double BACKROLLER_FRICTION_COEFFICIENT = .98; // TODO: find actual value
        public static final double BACKROLLER_MASS = 0.0025; // TODO: find actual value
        public static final double BACKROLLER_GEAR_RATIO = -1 / 2;
    }
    public final class Cargo {
        public static final double CARGO_RADIUS = 0.0160020320041;
        public static final double CARGO_MASS = 0.0025; // TODO: find actual value
    }
    public final class Shooter {
        public static final double FLYWHEEL_TO_BACKROLLER_DISTANCE = 0.279;
        public static final double HOOD_ANGLE = 27; // in degrees
        public static final double MOTOR_MAX_RPM = 6380;
    }

    public final class RobotMeasurements {
        public static final double HEIGHT_TO_SHOOTER = 0.5; // TODO: find actual value
    }
    public final class WorldMeasurements {
        public static final double AIR_DENSITY = 1.225;
        public static final double GRAVITY = 9.81;
        public static final double TURRET_TO_GOAL_HEIGHT = 2.76;
    }
}