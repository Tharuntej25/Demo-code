import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob"));
        Collections.sort(names); 
        
        System.out.println("Sorted List: " + names);
    }
}

