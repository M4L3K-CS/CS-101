package CS101.Exercises.Ex5;

/*Ex5 Write a program that, given a positive integer finds its integer square root and prints it out, if any.
 If there is no square root, the program should print a message indicating that.*/
public class Main {
    public static void main(String[] args) {
        int n = 121;
        boolean squareRootFound = false;
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                squareRootFound = true;
                System.out.println("Square root of " + n + " is " + i);
            }
        }
        if (!squareRootFound) {
            System.out.println("Square root of " + n + " does not exist!");
        }
    }
}
