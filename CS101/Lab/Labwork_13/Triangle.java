package CS101.Lab.Labwork_13;

import java.awt.Point;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a1, Point b1, Point c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    public Triangle(CS101.Lab.Labwork_13.Point tr1, CS101.Lab.Labwork_13.Point tr2, CS101.Lab.Labwork_13.Point tr3) {
    }

    public double perimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    public double area() {
        double x = a.distance(b);
        double y = b.distance(c);
        double z = c.distance(a);

        double u = (x + y + z) / 2;

        return Math.sqrt(u * (u - x) * (u - y) * (u - z));
    }

    public boolean contains(Point p) {
        Triangle p1 = new Triangle(this.a, this.b, p);
        Triangle p2 = new Triangle(this.a, p, this.c);
        Triangle p3 = new Triangle(p, this.b, this.c);

        double A = this.area();
        double A1 = p1.area();
        double A2 = p2.area();
        double A3 = p3.area();
        return (A * 0.9999 <= (A1 + A2 + A3)) && (A * 1.0001 >= (A1 + A2 + A3));
    }

    public char[] contains(CS101.Lab.Labwork_13.Point chosenPoint) {
        return null;
    }
}
