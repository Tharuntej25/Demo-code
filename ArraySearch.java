public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 19, 8};
        int target = 10;
        boolean found = false;
        
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }
}
