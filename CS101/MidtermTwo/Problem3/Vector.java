package CS101.MidtermTwo.Problem3;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    /**
     * Calculates and returns the magnitude of this 3D
     * vector.
     * 
     * @return the magnitude of the vector.
     */

    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Calculates and returns the dot product of this
     * vector with another vector.
     * 
     * @param other the other vector
     * @return the dot product
     */

    public double dotProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    /**
     * Calculte and returns the sum of this vector
     * and another vector as a new vector.
     * 
     * @param other the vector to be added to this
     * @return the sum of this vector and other
     */

    public Vector add(Vector other) {
        double x = this.x + other.x;
        double y = this.y + other.y;
        double z = this.z + other.z;
        return new Vector(x, y, z);
    }

    /**
     * Calculates and returns the cross product of this
     * vector with another vector. The result is
     * (this x other).
     * 
     * @param other the other vector
     * @return the cross product
     */

    public Vector crossProduct(Vector other) {
        double x = this.y * other.z - this.z * other.y;
        double y = this.z * other.x - this.x * other.z;
        double z = this.x * other.y - this.y * other.x;
        return new Vector(x, y, z);
    }

    /**
     * Calculates and returns the angle between this
     * vector and another vector, in radians.
     *
     * @param other the other vector
     * @return the angle between the two vectors, in radians
     */

    public double angle(Vector other) {
        double dotProduct = this.dotProduct(other);
        double magnitudeProduct = this.magnitude() * other.magnitude();
        return Math.acos(dotProduct / magnitudeProduct);
    }

    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);

        // Calculate and print the magnitude of v1
        double magnitude = v1.magnitude();
        System.out.println("Magnitude of v1: " + magnitude);

        // Calculate and print the dot product of v1 and v2
        double dotProduct = v1.dotProduct(v2);
        System.out.println("Dot product of v1 and v2: " + dotProduct);

        // Calculate and print the sum of v1 and v2
        Vector v3 = v1.add(v2);
        System.out.println("Sum of v1 and v2: (" + v3.getX() + ", " + v3.getY() + ", " + v3.getZ() + ")");

        // Calculate and print the cross product of v1 and v2
        Vector v4 = v1.crossProduct(v2);
        System.out.println("Cross product of v1 and v2: (" + v4.getX() + ", " + v4.getY() + ", " + v4.getZ() + ")");

        // Calculate and print the angle between v1 and v2
        double angle = v1.angle(v2);
        System.out.println("Angle between v1 and v2: " + angle + " radians");
    }
}