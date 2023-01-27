package CS101.Lectures.L7;

public class Main {
    public static void main(String[] args) {
        Complex x = new Complex();
        x.real = 3.0;
        x.imaginary = 4.0;
        Complex y = new Complex();
        y.real = 5.0;
        y.imaginary = 7.0;
        Complex sum = Complex.add(x, y);
        System.out.println(sum.real + " + " + sum.imaginary + " i ");

    }
}
