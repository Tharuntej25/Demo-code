import java.util.Arrays;

public class SortByLength {
    public static void main(String[] args) {
        String[] words = {"Elephant", "Dog", "Cat", "Lion", "Giraffe"};
        
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        
        System.out.println("Sorted by Length: " + Arrays.toString(words));
    }
}
