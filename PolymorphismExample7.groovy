class Printer {
    void print(int number) {
        System.out.println("Printing integer: " + number);
    }

    void print(double number) {
        System.out.println("Printing double: " + number);
    }

    void print(String text) {
        System.out.println("Printing string: " + text);
    }
}

public class PolymorphismExample7 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(10);          // Output: Printing integer: 10
        printer.print(10.5);        // Output: Printing double: 10.5
        printer.print("Hello");     // Output: Printing string: Hello
    }
}
