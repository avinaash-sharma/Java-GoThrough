class StudentCheck {
    private final String name;
    private int year;

    private static final int annualFees = 10000;

    public StudentCheck(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public int computeFees () {
        return StudentCheck.annualFees * year;
    }
}

class ResearchStudentCheck extends StudentCheck {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudentCheck(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;

    }

    @Override
    public String getDetails() {
        return super.getDetails() + '\n' + "Research Area : " + this.researchArea;
    }
}





public class MethodOverriding {
    public static void main(String[] a) {


        StudentCheck s1 = new StudentCheck("karan", 3);
        System.out.println(s1.getDetails());
        ResearchStudentCheck s2 = new ResearchStudentCheck("siddharth", 4, "Software Engineering");
        System.out.println(s2.getDetails());
    }
}

