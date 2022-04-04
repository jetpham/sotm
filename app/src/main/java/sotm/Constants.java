package sotm;

public final class Constants {
    /*
    * all constants are in SI units
    */
    public final class Flywheel{
        public static final double FLYWHEEL_RADIUS = 0.0508001016002;
        public static final double FLYWHEEL_FRICTION_COEFFICIENT = .98; //TODO: find actual value
        public static final double FLYWHEEL_MASS = 0.0025; //TODO: find actual value
    }
    public final class BackRoller{
        public static final double BACKROLLER_RADIUS = 0.0160020320041;
        public static final double BACKROLLER_FRICTION_COEFFICIENT = .98; //TODO: find actual value
        public static final double BACKROLLER_MASS = 0.0025; //TODO: find actual value
    }
    public final class Shooter{
        public static final double FLYWHEEL_TO_BACKROLLER_DISTANCE = 0.279;
        public static final double HOOD_ANGLE = 27; //in degrees
    }
    public final class RobotMeasurements{
        public static final double ROBOT_WIDTH = 0.5; // TODO: find actual value
        public static final double ROBOT_LENGTH = 0.5; // TODO: find actual value
        public static final double HEIGHT_TO_TURRET = 0.5; // TODO: find actual value
    }
}