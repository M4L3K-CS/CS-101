package CS101.Lectures.L7;

public class Complex {
    public double real;
    public double imaginary;

    public static Complex add(Complex a, Complex b) {
        Complex sum = new Complex();
        sum.real = a.real + b.real;
        sum.imaginary = a.imaginary + b.imaginary;
        return sum;
    }
}
