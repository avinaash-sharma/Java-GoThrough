class Square {
    protected double length, breadth;
    Square(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Length=" + length + "Breadth=" + breadth);
    }
}
public class Inheritance extends Square {
    double height;
    Inheritance(double length, double breadth, double height) {
        super(length, breadth);

        this.height = height;
        System.out.println("Height=" + height);
    }
    public static void main(String args[]) {
        Inheritance obj = new Inheritance(4,5,6);
    }
}