import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);
        map.put("Date", 1);

        
        map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())  
            .forEach(entry -> 
                System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
