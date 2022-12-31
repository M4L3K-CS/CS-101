package CS101.Lab.Labwork_12.Geometry;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 5);
        // Returns the value of x
        System.out.println(p.getX());
        Line line = new Line(new Point(0, 2), new Point(2, 4));
        // Y-intercept of the line ( y = mx + (n))
        System.out.println(line.getIntercept());
        // Slope of the line
        System.out.println(line.getSlope());
        // Boolean variable that returns true if the line is vertical
        System.out.println(line.isVertical());
    }
}
