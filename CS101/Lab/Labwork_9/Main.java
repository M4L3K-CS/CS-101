package CS101.Lab.Labwork_9;

public class Main {
    public static void main(String[] args) {
        double[] a = { 1, 2, 3, 4, 5 };
        System.out.println(mean(a));
    }

    public static double mean(double[] x) {
        double sum = 0.0;
        for (double d : x) {
            sum += d;
        }
        return sum / x.length;
    }
}
