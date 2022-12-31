package CS101.Exercises.Ex7;

/*Ex7 Enhance the previous program so that when there is no exact square root,
 it should print a message indicating the two integers the exact square root is between.
 For example, when the program is run with 75, it should say that the square root lies between 8 and 9.*/
public class Main {
    public static void main(String[] args) {
        int n = 75;
        double factorial = 1.0;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + " != " + factorial);
    }
}