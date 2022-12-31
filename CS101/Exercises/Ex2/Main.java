package CS101.Exercises.Ex2;

/*Ex2 Write a program to compute the sum of the squares of all positive integers up to and including 100.
(Do not use summa- tion formulas, make the computer do the addition.)*/
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i * i;
        }
        System.out.println(sum);
    }
}
