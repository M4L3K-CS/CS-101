package CS101.MidTermPractice.P5;

public class Main {
    public static void main(String[] args) {
        int x = 13;
        int y = -4;
        if (x - y > 5) {
            if (x + 1 <= 13) {
                System.out.println("Output 1");
            } else {
                System.out.println("Output 2");
            }
        } else if ((x == 5 && y > 3) || (y == 3 && x > 4)) {
            System.out.println("Output 3");
        } else {
            System.out.println("Output 4");
        }
    }
}
