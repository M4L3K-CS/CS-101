package CS101.MidTerm2.Problem2;

public class P2 {

    public static void main(String[] args) {
        double[] x = {};
        double[] y = { 3 };
        double[] z = { 1, 2, -5, 3, 3, 4 };
        System.out.println(largestIncrease(x)); // Should print 0.0
        System.out.println(largestIncrease(y)); // Should print 0.0
        System.out.println(largestIncrease(z)); // Should print 8.0

    }

    /**
     * Calculate and return the largest increase in the array.
     * 
     * If the array is empty or of size 1, it returns zero.
     * 
     * Otherwise, it returns the largest of d[i] - d[i-1],
     * present in the array.
     * 
     * @param d The array containing a series of double values
     * @return The largest increase in the array.
     */
    public static double largestIncrease(double[] d) {
        double maxValues = 0.0;
        double largestIncrease = maxValues;
        for (double i = 0; i < d.length - 1; i++) {
            double increase = d[(int) (i + 1)] - d[(int) i];
            largestIncrease = Math.max(largestIncrease, increase);
        }
        return largestIncrease;
    }
}
