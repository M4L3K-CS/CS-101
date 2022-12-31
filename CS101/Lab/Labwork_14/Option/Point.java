package CS101.Lab.Labwork_14.Option;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;

        return Math.sqrt(dx * dx + dy * dy);
    }
}
