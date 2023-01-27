package CS101.Exercises.Ex3;

/*Ex3 Write a program to find all three-digit positive integers such that the sum of the cubes
of the decimal digits are equal to the number itself.(MIDTERMS)*/
public class Main {

    public static void main(String[] args) {
        // My number is 3 digits ABC
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    if (a * a * a + b * b * b + c * c * c == 100 * a + 10 * b + c) {
                        System.out.println(a + "" + b + "" + c);
                    }
                }
            }
        }
    }
}