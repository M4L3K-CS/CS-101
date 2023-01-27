package CS101.Exercises.Ex6;

/*Ex6 Enhance the previous program so that when there
is no exact square root, it should print a message indicating the two integers the exact square root is between.
For example, when the program is run with 75, it should say that the square root lies between 8 and 9.*/
public class Main {
    public static void main(String[] args) {
        int n = 121;
        int i;
        for (i = 1; i * i < n; i++) {
            if (i * i == n) {
                System.out.println(i);
            } else {
                System.out.println("No Root");
            }
        }
    }
}
