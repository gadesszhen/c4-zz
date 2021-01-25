import java.util.Scanner;

class Complex{
    private int real;
    private int imaginary;
    public void setReal(int r){
        real = r;
    }
    public void setImaginary(int i){
        imaginary = i;
    }
    public int getReal(){
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    Complex Add(Complex a, Complex b){
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.imaginary = a.imaginary + b.imaginary;
        return c;
    }
    Complex Reduce(Complex a,Complex b){
        Complex c = new Complex();
        c.real = a.real - b.real;
        c.imaginary = a.imaginary - b.imaginary;
        return c;
    }
    Complex Multiply(Complex a,Complex b){
        Complex c = new Complex();
        c.real = a.real*b.real - a.imaginary*b.imaginary;
        c.imaginary = a.imaginary*b.real + a.real*b.imaginary;
        return c;
    }
    public String toString() {
        return "[" + real  + "+" + imaginary + "i]";
    }
}

public class Test7 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Complex a = new Complex();
        Complex b = new Complex();
        Complex c = new Complex();
        System.out.println("input the first complex:");
        a.setReal(in.nextInt());
        a.setImaginary(in.nextInt());
        System.out.println("input the second complex:");
        b.setReal(in.nextInt());
        b.setImaginary(in.nextInt());
        System.out.println("a add b is"+c.Add(a,b).toString()+",a reduce b is"+c.Reduce(a,b).toString()+",a multiply b is"+c.Multiply(a,b).toString());
    }
}
