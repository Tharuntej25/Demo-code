class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Charging the electric car's battery.");
    }
}

public class MultilevelInheritanceExample2 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();        // Inherited from Vehicle
        tesla.drive();        // Inherited from Car
        tesla.chargeBattery(); // Method in ElectricCar
    }
}
