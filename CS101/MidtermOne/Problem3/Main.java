package CS101.MidtermOne.Problem3;

public class Main {

    public static void main(String[] args) {
        for (int n = 1000; n <= 9999; n++) {
            int numDivisors = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    numDivisors++;
                }
            }
            if (numDivisors == 22) {
                System.out.println(n);
            }
        }
    }
}
