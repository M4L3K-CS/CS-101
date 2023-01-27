package CS101.MidtermPractice.P2;

/* When given two numbers a and b, it is possible for the user to provide b as 0. Addition, multiplication and subtraction will not have any effect.
However, in this specific case, the division cannot be carried out. Modify the code in exercise 1 to perform division on a and b. */
public class Main {

    public static void main(String[] args) {
        double a = 5;
        double b = 0;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b == 0) {
            System.out.println("Division by 0 ");
        } else
            System.out.println("a / b = " + (a / b));
    }
}