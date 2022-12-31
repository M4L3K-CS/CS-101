package CS101.Lab.Labwork_8;

/* Write a method that takes the array the number as arguments and returns a boolean */
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = { 7, 3, -3, 3, 17, 15, 34 };
        // int[] a = generateRandomIntegerArray(1_000_000_000);
        System.out.println(searchForSum(a, 40));

    }

    public static boolean searchForSumFaster(int[] a, int x) {
        Arrays.sort(a);
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int sum = a[i] + a[j];

            if (sum == x) {
                return true;
            } else if (sum < x) {
                return true;

            } else {
                j--;
            }

        }
        return false;
    }

    public static boolean searchForSum(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == x) {

                    return true;
                }
            }
        }
        return false;

    }

    public static int[] generateRandomIntegerArray(int n) {
        Random random = new Random();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt();
        }
        return a;
    }

}
