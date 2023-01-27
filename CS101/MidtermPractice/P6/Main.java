package CS101.MidtermPractice.P6;

/* Write a java program that calculates the sum of integers from 1 to 30. The output should be: Sum = 465 */
public class Main {
    public static void main(String[] args) {
        int n = 30;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
