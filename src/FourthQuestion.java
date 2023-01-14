import java.util.Scanner;

public class FourthQuestion {
    public static void main(String args[]){
//        14th January, 2023
//        Write a Java program to find the index of an array element.
        int[] arr = {1, 56, 7, 28, 97, 12, 99};

        FourthQuestion fourthQuestion = new FourthQuestion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Search Element");
        int searchElement = sc.nextInt();
        int value = fourthQuestion.getIndex(arr,searchElement);
        if(value < 0){
            System.out.println("Not found");
        }else{
            System.out.println("Found at:"+ value);
        }
    }

    public int getIndex(int arr[], int searchElement){
        if (arr == null) {

            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == searchElement) {

                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }
}
