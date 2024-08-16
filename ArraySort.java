import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 7, 1, 8};
        Arrays.sort(numbers);
        
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
