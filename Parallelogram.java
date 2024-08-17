import java.io.*;
import java.util.*;

public class Parallelogram {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int breadth = scanner.nextInt();
       int height = scanner.nextInt();

      
        if (breadth > 0 && height > 0) {
            
            int area = breadth * height;
        
            System.out.println(area);
        } else {
                   System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

       
        scanner.close();
    }
}
