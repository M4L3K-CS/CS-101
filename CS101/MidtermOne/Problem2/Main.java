package CS101.MidtermOne.Problem2;

public class Main {

    public static void main(String[] args) {
        int n = 12;

        int numDivisors = 0;

        // Your code goes here.
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numDivisors++;
            }
        }

        System.out.println(numDivisors);
    }
}
