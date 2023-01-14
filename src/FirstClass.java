public class FirstClass {
    public static void main(String args[]){
//        14th January, 2023
//        Write a Java program to find the maximum and minimum value of an array.
        FirstClass firstClass = new FirstClass();
        int arr [] = {1,56,7,28,97,12,99};
        System.out.println("Minumum: "+firstClass.getMin(arr));
        System.out.println("Maximum: "+firstClass.getMax(arr));
    }
    public int getMin(int arr[]){
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public int getMax(int arr[]){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
