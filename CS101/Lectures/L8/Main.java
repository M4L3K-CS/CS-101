package CS101.Lectures.L8;

public class Main {
    public static void main(String[] args) {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(5.0, 7.0);
        Complex sum = x.add(y);
        System.out.println(sum.real + " + " + sum.imaginary + " i ");

    }
}
