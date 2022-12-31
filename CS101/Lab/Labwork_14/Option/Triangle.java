package CS101.Lab.Labwork_14.Option;

import java.awt.Point;

public class Triangle {
    public static boolean isInside(Point p, Point a, Point b, Point c) {
        // Compute the barycentric coordinates of the point p ((u = Area of CAP/ABC,v =
        // ABP/ABC, w = BCP/ABC) = 1))
        double u = ((b.y - c.y) * (p.x - c.x) + (c.x - b.x) * (p.y - c.y)) /
                ((b.y - c.y) * (a.x - c.x) + (c.x - b.x) * (a.y - c.y));
        double v = ((c.y - a.y) * (p.x - c.x) + (a.x - c.x) * (p.y - c.y)) /
                ((b.y - c.y) * (a.x - c.x) + (c.x - b.x) * (a.y - c.y));
        double w = 1 - u - v;

        // Check if the point is inside the triangle
        return (u >= 0) && (v >= 0) && (w >= 0);
    }

    public static void main(String[] args) {
        Point p = new Point(15, 15);
        Point a = new Point(0, 0);
        Point b = new Point(10, 0);
        Point c = new Point(0, 10);

        boolean inside = isInside(p, a, b, c);
        System.out.println(inside);
    }
}