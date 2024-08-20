class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class Solution {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = 10, num2 = 5;
        
        System.out.println("Add: " + calc.add(num1, num2));
        System.out.println("Subtract: " + calc.subtract(num1, num2));
        System.out.println("Multiply: " + calc.multiply(num1, num2));
        System.out.println("Divide: " + calc.divide(num1, num2));
    }
}
