package CS101.MidtermOne.Problem1;

public class Main {
    public static void main(String[] args) {
        double ln2 = 0.0;
        for (int i = 1; i <= 1000; i++) {
            ln2 += Math.pow(-1, i - 1) * (1.0 / i);
        }
        System.out.println(ln2);
    }
}
