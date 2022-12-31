package CS101.MidTermPractice.P3;

/* Write a program that will take from the user a number integer between 1 and 7.
The program will then write the matching day name. If the user inputs any number outside the range [1-7] print "Day is undefined". */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        if (n == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else if (n == 7) {
            System.out.println("Sunday");
        } else
            System.out.println("Day is undefined");
    }
}
