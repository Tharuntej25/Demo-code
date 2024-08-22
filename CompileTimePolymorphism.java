class Adder {
 
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(2, 3));       // Output: 5
        System.out.println(adder.add(2, 3, 4));    // Output: 9
        System.out.println(adder.add(2.5, 3.5));   // Output: 6.0
    }
}
