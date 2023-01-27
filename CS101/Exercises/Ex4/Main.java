package CS101.Exercises.Ex4;

/*Ex4 Write a program to find all three-digit numbers where the sum of their decimal digits is exactly 25.*/
public class Main {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    if (a + b + c == 25) {
                        System.out.println(a + "" + b + "" + c);
                    }
                }
            }
        }
    }
}
