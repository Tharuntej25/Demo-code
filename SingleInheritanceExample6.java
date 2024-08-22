class Appliance {
    void turnOn() {
        System.out.println("Appliance is turned on");
    }
}

class Refrigerator extends Appliance {
    void cool() {
        System.out.println("Refrigerator is cooling");
    }
}

public class SingleInheritanceExample6 {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator();
        fridge.turnOn(); 
        fridge.cool();  
}
