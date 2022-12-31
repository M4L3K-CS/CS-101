package CS101.Lab.Labwork_12.Geometry;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point a, Point b) {
        this.p1 = a;
        this.p2 = b;

    }

    /**
     * Create a line where the equation is
     * 
     * a * x + b * y + c = 0
     * 
     * @param a
     * @param b
     * @param c
     */
    public Line(double a, double b, double c) {
        if (a != 0 && b != 0 && c != 0) {
            this.p1 = new Point(0, -c / b);
            this.p2 = new Point(-c / a, 0);
        } else if (a != 0 && b != 0 && c == 0) {
            this.p1 = new Point(0, 0);
            this.p2 = new Point(-b, a);
        } else if (a == 0 && b != 0) {
            this.p1 = new Point(0, -c / b);
            this.p2 = new Point(1, -c / b);
        } else if (b == 0 && a != 0) {
            this.p1 = new Point(-c / a, 0);
            this.p2 = new Point(-c / a, 1);
        } else {
            throw new IllegalArgumentException("No such line exists");
        }
    }

    /**
     * Return the slope of this line.
     *
     * The slope is m where the equation is
     *
     * y = m * x + n
     *
     * @return the slope of the line.
     */
    public double getSlope() {
        if (p2.getX() - p1.getX() != 0) {
            double m = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
            return m;
        } else {
            throw new IllegalArgumentException("The denominator is equal 0!");
        }
    }

    /**
     * Return whether the line is vertical.
     * 
     * @return true if line is vertical.
     */
    public boolean isVertical() {

        return (p1.getX() == p2.getX());
    }

    /**
     * Returns n where equation of line is
     * y = m * x + n
     * 
     * @return the y intercept
     */
    public double getIntercept() {
        if (p1.getX() != p2.getX()) {

            return (p1.getY() * p2.getX() - p1.getX() * p2.getY()) / (p2.getX() - p1.getX());
        } else {
            throw new IllegalArgumentException("n does not exist!");

        }

    }
}