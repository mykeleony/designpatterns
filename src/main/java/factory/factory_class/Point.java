package factory.factory_class;

public class Point {
    private double x;
    private double y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // If we want to keep 2 completely ways to create points, Factory class should not be an inner class.
    public static class Factory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Point point = Point.Factory.newCartesianPoint(3, 5);
    }
}


