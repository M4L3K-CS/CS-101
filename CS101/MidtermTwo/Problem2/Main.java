package CS101.MidtermTwo.Problem2;

public class Main {

    public static void main(String[] args) {
        double[] x = {};
        double[] y = { 3 };
        double[] z = { 1, 2, -5, 3, 3, 4 };

        System.out.println(largestIncrease(x)); // Should print 0.0
        System.out.println(largestIncrease(y)); // Should print 0.0
        System.out.println(largestIncrease(z)); // Should print 8.0

    }

    public static double largestIncrease(double[] d) {
        if (d == null || d.length <= 1) {
            return 0.0;
        }

        double largestIncrease = 0.0;
        for (int i = 1; i < d.length; i++) {
            double increase = d[i] - d[i - 1];
            if (increase > largestIncrease) {
                largestIncrease = increase;
            }
        }

        return largestIncrease;
    }
}
