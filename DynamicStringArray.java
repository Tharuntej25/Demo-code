import java.util.ArrayList;

public class DynamicStringArray {
    public static void main(String[] args) {
        // Create a dynamic array for strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the array
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the elements
        System.out.println("Fruits: " + fruits);

        // Check if the array contains an element
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the list.");
        }

        // Get the size of the array
        System.out.println("Number of fruits: " + fruits.size());
    }
}
