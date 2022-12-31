package CS101.MidTerm2.Problem3;

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
        return (x * other.x) + (y * other.y) + (z * other.z);
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
    public static double[] crossProduct(double[] u, double[] v) {
        double[] result = new double[3];
        result[0] = u[1] * v[2] - u[2] * v[1];
        result[1] = u[2] * v[0] - u[0] * v[2];
        result[2] = u[0] * v[1] - u[1] * v[0];
        return result; 
    }

    /**
     * Calculates and returns the angle between this
     * vector and another vector, in radians.
     *
     * @param other the other vector
     * @return the angle between the two vectors, in radians
     */
    public static double angleBetween(double[] u, double[] v) {
        double dotProduct = dotProduct(u, v);
        double lengthProduct = length(u) * length(v);
        double cosine = dotProduct / lengthProduct;
        return Math.acos(cosine);
    }

    private static double dotProduct(double[] u, double[] v) {
        return 0;
    }

    private static int length(double[] u) {
        return 0;
    }

}