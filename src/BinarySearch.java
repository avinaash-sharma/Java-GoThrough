

public class BinarySearch {
    public static void main(String args[]){
        int array[] = {10,20,30,40,50,65,70,80,90};
        int searchFor = 65;

        binarySearch(array, 0, array.length, searchFor);
    }
    public static void binarySearch(int array[],int left, int right, int search){
        
        int mid = (left + right)/2;
        
        if(left > right){
            System.out.println("Not found");
        }
        if(array[mid] == search){
            System.out.println("found at "+mid);
        }
        else if(array[mid] > search){
            right = mid-1;
            binarySearch(array, left, right, search);
        }
        else{
            left = mid+1;
            binarySearch(array, left, right, search);
        }
    }
}
