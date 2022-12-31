package CS101.MidTerm1.Problem1.Answer1;
/* Mathematically, the natural logarithm of a number has a the following series expansion:
ln(1+𝑥)=𝑥−𝑥22+𝑥33−𝑥44⋯
This series does not converge for all values of x, but it does converge for x = 1, giving a series for ln 2:
ln(2)=1−12+13−14⋯
Write a program to compute the value of ln(2) as a double, using the first 1000 terms of the series.
Do not attempt to use library methods. Also, your code should only print the final computed value of ln(2) as its output.
Using more or less than 1000 terms of the series os considered to be an error. Obeying specifications is important. */
public class Main {
    public static void main(String[] args) {
        int n = 2;
        double sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += 1.0 / fact;
        }
        System.out.println(sum);
    }
}
