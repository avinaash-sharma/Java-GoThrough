public class CheckOutPut {
    public static void main(String[] args) {

        TestClass2 c1 = new TestClass2(2, 5.2);
        TestClass2 c2 = new TestClass2(3, 7.5);
        System.out.println(c1.a + ", " + c1.b);
    }
}

class TestClass2 {

    public int a;
    public double b;

    public TestClass2(int first, double second) {

        this.a = first;
        this.b = second;
    }
}