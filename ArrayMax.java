public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {45, 3, 88, 29, 15};
        int max = numbers[0];
        
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Maximum element: " + max);
    }
}
