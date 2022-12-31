package CS101.MidTerm1.Problem2.Answer2;

/* Every positive integer n has divisors which can divide it exactly.
For example, the number 6 has 4 divisors:
1, 2, 3, 6
Prime numbers have exactly two divisors. Like 5 has 2 divisors:
1, 5
Write a Java program that will start with an integer, and find its number of divisors, and print it on the screen. */
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int numDivisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(numDivisors + i);
            }
        }
    }
}