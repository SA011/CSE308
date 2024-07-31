import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter File Name:");
        Scanner sc = new Scanner(System.in);
        
        String filename = sc.next();
        FileSummer summer = new FileAdapter();
        System.out.println("Sum of the numbers in the file: " + summer.calculateSum(new File(filename)));
        
        sc.close();
    }
}
