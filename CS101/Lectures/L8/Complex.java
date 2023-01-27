package CS101.Lectures.L8;

public class Complex {
    public double real;
    public double imaginary;

    public Complex() {

    }

    public Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;

    }

    public static Complex add(Complex a, Complex b) {
        Complex sum = new Complex();
        sum.real = a.real + b.real;
        sum.imaginary = a.imaginary + b.imaginary;
        return sum;
    }

    public Complex add(Complex other) {
        Complex sum = new Complex();
        sum.real = this.real + other.real;
        sum.imaginary = this.imaginary;
        return sum;
    }

}
