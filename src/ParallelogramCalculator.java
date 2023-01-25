
//Description
//Given an abstract class Quadrilateral, create subclasses Parallelogram, Rhombus, Rectangle, and Square, which implement the getArea() and getPerimeter()
// methods correctly.
//Note: You can look into the stub file to figure out what is the input we are taking and the output we are producing.

import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1+side2+side3+side4);
    }
}

class Parallelogram extends Quadrilateral {
    double height;

    public Parallelogram(double side1, double side2, double height) {
        super(side1, side2, side1, side2);
        this.height = height;
    }

    @Override
    protected double getArea() {
        return side1 * height;
    }
}

class Rhombus extends Quadrilateral {
    double height;

    public Rhombus(double side, double height) {
        super(side, side, side, side);
        this.height = height;
    }

    @Override
    protected double getArea() {
        return (side1 * height);
    }
}

class Rectangle extends Quadrilateral {
    public Rectangle(double length, double breadth) {
        super(length, breadth, length, breadth);
    }

    @Override
    protected double getArea() {
        return side1 * side2;
    }
}

class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side, side, side);
    }

    @Override
    protected double getArea() {
        return side1 * side1;
    }
}

// Do not edit the Test class
class ParallelogramCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);
        System.out.println("Parallelogram Perimeter: " + parallelogram.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        //Rhombus
        double side = scan.nextDouble();
        height = scan.nextDouble();
        Rhombus rhombus = new Rhombus(side, height);
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());
        System.out.println("Rhombus Area: " + rhombus.getArea());

        //Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        //Square
        side = scan.nextDouble();
        Square square = new Square(side);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        scan.close();
    }
}