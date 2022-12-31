package CS101.MidTerm1.Problem2.Correction2;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int numDivisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numDivisors++;
            }
        }
        System.out.println(numDivisors);
    }

}
