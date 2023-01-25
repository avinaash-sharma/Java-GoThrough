//You are given an unsorted array with n integers. You need to move all zeros(if any) to the end of the array and the order of the non-zero integers shouldn’t be altered.
//
//        Example:
//        array = [5, 8, 0, 15, 6, 0, 1, 0, 13]
//        Output:
//        array = [5, 8, 15, 6, 1, 13, 0, 0, 0]
import java.util.*;

public class ArrayListQuestion {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        // for (int i = 0; i < arr.length; i++)
        //     System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        int nonZeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroCount++] = arr[i];
            }
        }
        while (nonZeroCount < arr.length) {
            arr[nonZeroCount++] = 0;
        }
        for(int i : arr){
            System.out.print(i+ " ");
        }

    }
}
