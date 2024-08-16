public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, 45};
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
