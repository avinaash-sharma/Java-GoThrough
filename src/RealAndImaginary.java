import java.util.Scanner;

class Number {
    //Write your code here
    double imaginaryNumber, realNumber;

    public Number(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public void setImaginaryNumber(double imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    public double getImaginaryPart() {
        //Write your code here
        return imaginaryNumber;
    }

}

class Complex extends Number {
    public Complex(double realNumber, double imaginaryNumber) {
        super(realNumber, imaginaryNumber);
    }

    //Write your code here
    public String checkComplex() {
        if (this.getRealNumber() == 0 && this.getImaginaryPart() == 0) {
            return "The given number is real";
        } else {
            return "The given number is complex";
        }
    }

}

class PurelyImaginary extends Complex {
    public PurelyImaginary(double realNumber, double imaginaryNumber) {
        super(realNumber, imaginaryNumber);
    }


    //Write your code here


    public String checkPurelyImaginaryNumber() {
        if (this.getRealNumber() == 0) {
            return "The number is purely imaginary";
        } else {
            return "The number is not purely imaginary";
        }
    }
}

public class RealAndImaginary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());

        num.checkComplex();
        num.checkPurelyImaginaryNumber();
        System.out.println(num.getImaginaryPart());
        System.out.println(num.checkComplex());
        System.out.println(num.getRealNumber() + " + i" + num.getImaginaryPart());
        System.out.println(num.checkPurelyImaginaryNumber());
    }
}

