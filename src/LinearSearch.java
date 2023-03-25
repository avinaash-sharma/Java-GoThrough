public class LinearSearch {
    public static void main(String args[]){
        int data[] = {10,20, 9, 80,80, 56};
        int searchElement = 80;
        for (int i = 0;i < data.length; i++){
            if(data[i] == searchElement){
                System.out.println("Found at "+i);

            }
        }

    }
}
