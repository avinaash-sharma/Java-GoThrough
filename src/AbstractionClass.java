// class AbstractionClass {
//    public static float radius = 10.0f;
////    public static void main(String args[]){
////        System.out.println(Circle.area(radius));
////    }
//    public static float area(float radius){
//        return 3.14f * radius * radius;
//    }
//}

class Circle{
    public static float area(float radius){
        System.out.println("From Circle Class");
        return 3.14f * radius * radius;
    }
}


public class AbstractionClass {
    public static void main(String[] args) {
        Student s1 = new Student(1056, "karan", 8.8);
        s1.displayProfile();
        System.out.println("Percentage of s1 is " + s1.findPercentage());
    }
}
class Student {
    public int rollno;
    public String name;
    public double cgpa;

    public Student(int rollno, String name, double cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }

    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}