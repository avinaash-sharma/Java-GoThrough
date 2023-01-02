import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String args[]) throws FileNotFoundException {
        File inputFile = new File("/Users/avinash/Documents/development/Java/Java-GoThrough/src/numberFile.txt");
        Scanner scan = new Scanner(inputFile);
        double value = 0.0;
        int count = 0;
        while(scan.hasNext()){
             value = value + scan.nextInt();
             count ++;

        }
        double mean = value/(double) count;
        System.out.println(mean);
    }
}
