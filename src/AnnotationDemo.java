import java.util.*;

class RectangleOne{
    public void printNameOfClass(){
        System.out.println("Rectangle");
    }
}
class SquareOne extends RectangleOne{
    @Override
    public void printNameOfClass(){
        System.out.println("Square");
    }
}

public class AnnotationDemo{
    public static void main(String[] args){
        SquareOne s = new SquareOne();
        s.printNameOfClass();
    }
}