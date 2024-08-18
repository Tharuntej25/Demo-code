import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers);
        
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
