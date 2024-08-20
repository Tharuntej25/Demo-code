class Car {
    String model;
    String manufacturer;
    double price;

    Car(String model, String manufacturer, double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    void start() {
        System.out.println("Car " + model + " is starting...");
    }

    void stop() {
        System.out.println("Car " + model + " is stopping...");
    }

    void displayDetails() {
        System.out.println("Model: " + model + ", Manufacturer: " + manufacturer + ", Price: " + price);
    }
}

public class Solution {
    public static void main(String[] args) {
        Car car = new Car("Model S", "Tesla", 79999.99);
        car.start();
        car.stop();
        car.displayDetails();
    }
}
