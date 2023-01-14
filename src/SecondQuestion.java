import java.sql.Array;
import java.util.Arrays;

public class SecondQuestion {
    public static void main(String args[]){
//        14th January, 2023
//        Write a Java program to reverse an array of integer values.
        SecondQuestion secondQuestion = new SecondQuestion();
        int arr [] = {1,56,7,28,97,12,99};
        System.out.println("Actual Array: "+ Arrays.toString(arr));
        System.out.println("Reversed Array: "+ secondQuestion.reverseArray(arr));
    }
    public String reverseArray(int arr[]){
        int reversedArray[] = new int[arr.length];

        int j =arr.length;
        for(int i=0;i<arr.length;i++){
            reversedArray[j-1] = arr[i];
            j =j-1;
        }
        return Arrays.toString(reversedArray);
    }
}
