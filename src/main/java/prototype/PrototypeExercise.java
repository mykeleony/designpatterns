package prototype;

import java.io.Serializable;

public class PrototypeExercise {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1, 2), new Point(3, 5));

        Line l2 = l1.deepCopy();
        l2.end = new Point(8, 1);

        System.out.println(l1);
        System.out.println(l2);
    }
}

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this(other.x, other.y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Line {
    public Point start;
    public Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy() {
        Line copy = new Line(new Point(this.start), new Point(this.end));

        return copy;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
