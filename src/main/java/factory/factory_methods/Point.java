package factory.factory_methods;

/*
    Factory methods approach:
 */
public class Point {
    private double x;
    private double y;

    // Default constructor must be private so that the user is forced to use the specific one (factory method approach).
    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Factory methods must be static so they can be used without any instantiation of the class, which is more semantic.
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }
}