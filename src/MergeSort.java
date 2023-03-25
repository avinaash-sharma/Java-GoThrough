import java.io.IOException;

public class MergeSort {
    public static void main(String args[]) throws IOException
    {
        int array[] = {10, 7, 8, 5, 4, 20, 1};
        int length = array.length;
        System.out.println(length);
        int mid = length/2;
        mergeSort(array, mid, 0, length-1);
    }
    public static void mergeSort(int arr[], int mid, int start, int end){
//        while()
    }
}
