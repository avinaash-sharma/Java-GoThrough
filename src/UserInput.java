
import java.util.Scanner;
public class UserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first value : ");
        int i = sc.nextInt();
        System.out.println("Please input the second value : ");
        int j = sc.nextInt();
        System.out.println("Sum is: "+ (i+j));
    }
}
