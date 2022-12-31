package CS101.Lab.Labwork_13;

public class UprightSquare {
    private Point lowerLeftCorner;
    private double sideLength;

    public UprightSquare(Point lowerLeftCorner, double sideLength) {
        this.lowerLeftCorner = lowerLeftCorner;
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public Point getLowerLeftCorner() {
        return this.lowerLeftCorner;
    }

    public double perimeter() {
        return 4 * sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }

    public boolean contains(Point p) {
        double x1 = lowerLeftCorner.getX();
        double x2 = lowerLeftCorner.getX() + sideLength;

        double y1 = lowerLeftCorner.getY();
        double y2 = lowerLeftCorner.getY() + sideLength;

        return (p.getX() >= x1 && p.getX() <= x2)
                && (p.getY() >= y1 && p.getY() <= y2);

    }

}