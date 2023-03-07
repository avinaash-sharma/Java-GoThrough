import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class WithListIterator {

    public static void main(String[] args) {

        List<AStudent> studentList1 = new ArrayList<AStudent>();
        AStudent s1 = new AStudent("Sujit",1);
        AStudent s2 = new AStudent("Siddharth",2);
        AStudent s3 = new AStudent("Karanpreet",3);
        AStudent s4 = new AStudent("Hari",5);
        AStudent s5 = new AStudent("Tricha",4);

        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);

//        iterateFwd(studentList1);
        List<Integer> num = new ArrayList<Integer>();
        List<Integer> twoDigits = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        twoDigits.add(1);
        twoDigits.add(2);
//        iterate(num);
        iterateTwo(twoDigits);
    }

    public static void iterate(List<Integer> num) {
        ListIterator<Integer> it = num.listIterator(num.size());
        while(it.hasPrevious()) {
            if(it.hasPrevious()) {
                System.out.println(it.previous());
            }
            it.previous();
        }
    }

    public static void iterateTwo(List<Integer> num) {
        ListIterator<Integer> listIterator = num.listIterator();
        while(listIterator.hasNext()) {

//            System.out.print(listIterator.hasNext());
            System.out.print(listIterator.next());
            listIterator.previous();
        }
    }
    private static void iterateFwd(List<AStudent> students) {
//        ListIterator<AStudent> it = students.listIterator(2);
//        System.out.println("Printing student list...");
//
//        System.out.println(it.next().getDetails());
        ListIterator<AStudent> it = students.listIterator(2);
        System.out.println(it.next().getDetails());
//        while(it.hasNext()) {
//            System.out.println(it.next().getDetails());
//        }
    }
}
class AStudent {
    private final String name;
    private final int rollNumber;

    public AStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}
