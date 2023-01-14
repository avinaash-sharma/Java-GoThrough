import java.util.Scanner;

public class FifthQuestion {
    //    Write a Java program to test if an array contains a specific value
    public static void main(String args[]) {
//        14th January, 2023
        FifthQuestion fifthQuestion = new FifthQuestion();
        int[] arr = {1, 56, 7, 28, 97, 12, 99};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Search Element");
        int searchElement = sc.nextInt();
        String value = fifthQuestion.getIndex(arr,searchElement);

            System.out.println(value);

    }
    public String getIndex(int arr[], int searchElement){
        if (arr == null) {

            return "Not Found";
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == searchElement) {

                return "Found";
            } else {
                i = i + 1;
            }
        }
        return "Not Found";
    }

}
