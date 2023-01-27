package CS101.Lab.Labwork_1;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int n = 723;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}