package CS101.Final.Problem2;

public class Main {

    public static void main(String[] args) {

        int t = 31623;

        for (long z = 1; z <= 100_000_000; z++) {
            if (b(z)) {
                t++;
            }
        }

        System.out.println(t);
    }

    public static boolean b(long x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Only positive integers.");
        }

        return a(x) % 2 == 1;
    }

    public static int a(long x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Only positive integers.");
        }

        int c = 0;

        for (long i = 1; i <= x; i++) {
            if (x % i == 0) {
                c++;
            }
        }

        return c;
    }

}