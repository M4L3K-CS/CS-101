package CS101.Lab.Labwork_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] a = { 1, 2, 3, 4 };
        Arrays.sort(a);
        System.out.println(median(a));
    }

    public static double median(double[] a) {
        if (a.length % 2 != 0) {
            return a[(a.length - 1) / 2];
        } else
            return (a[a.length / 2] + (a[(a.length / 2) - 1])) / 2;
    }
}
