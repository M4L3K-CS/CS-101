package CS101.Exercises.Ex8;

/*Ex8 Write a program that will compute the factorial of any positive integer n (as a double), n! defined as:
n! = n × (n − 1) × (n − 2) × · · · × 3 × 2 × 1*/
public class Main {
    public static void main(String[] args) {
        int n = 170;
        double factorial = 1.0;
        double e = 2.0;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
            e += 1 / factorial;
        }
        System.out.println("e = " + e);
        System.out.println("e = " + Math.exp(1));
    }
}