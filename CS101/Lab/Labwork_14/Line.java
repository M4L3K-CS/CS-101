package CS101.Lab.Labwork_14;

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
     * @param a parameter a
     * @param b parameter b
     * @param c parameter c
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
            throw new IllegalArgumentException("No such line exists.");
        }
    }

    /**
     * Get the slope of the line.
     *
     * This is m where the equation is:
     *
     * y = m * x + n
     *
     * @return the slope
     */

    public double getSlope() {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();

        return dy / dx;
    }

    /**
     * Return whether the line is vertical.
     * 
     * @return true if line is vertical.
     */
    public boolean isVertical() {
        return p1.getX() == p2.getX();
    }

    /**
     * Returns n where equation of line is
     * y = m * x + n
     * 
     * @return the y intercept
     */
    public double getYIntercept() {
        return (p2.getX() * p1.getY() - p1.getX() * p2.getY()) / (p2.getX() - p1.getX());
    }

    public Point intersection(Line other) {
        double x = (this.getSlope() * this.p1.getX() - other.getSlope() * other.p1.getX() + other.p1.getY()
                - this.p1.getY()) / (this.getSlope() - other.getSlope());
        double y = this.getSlope() * (x - this.p1.getX()) + this.p1.getY();
        return new Point(x, y);

    }
}
