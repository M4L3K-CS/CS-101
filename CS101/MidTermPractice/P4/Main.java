package CS101.MidTermPractice.P4;

/* Write a java program that can take an integer number made up of 3 digits from the user and print the sum of these digits. */
public class Main {
    public static void main(String[] args) {
        int n = 926;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
