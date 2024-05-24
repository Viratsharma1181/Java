import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c) {
        double newReal = this.real + c.real;
        double newImaginary = this.imaginary + c.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public void display() {
        System.out.println("Complex Number: " + this.real + " + " + this.imaginary + "i");
    }
}

public class ComplexNumberAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the real part of the first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = sc.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);

        System.out.print("Enter the real part of the second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = sc.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);

        Complex sum = c1.add(c2);
        System.out.print("Sum of the complex numbers: ");
        sum.display();

        sc.close();
    }
}
