import java.util.Arrays;
import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
//        14th Januray, 2023
//        Write a Java program to remove a specific element from an array.

        ThirdQuestion thirdQuestion = new ThirdQuestion();
        int[] arr = {1, 56, 7, 28, 97, 12, 99};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to be removed from array");
        int removeValue = sc.nextInt();
        arr = thirdQuestion.removeElement(arr, removeValue);
        System.out.println(Arrays.toString(arr));

    }

    public int getIndex(int[] arr, int removeValue) {

        if (arr == null) {

            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == removeValue) {
                System.out.println(i);
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;

    }

    public int[] removeElement(int[] arr, int removeValue) {
        int index = getIndex(arr, removeValue);
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else if (i + 1 < arr.length) {
                newArray[i] = arr[i + 1];
            }

        }

        return newArray;
    }
}
