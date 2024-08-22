class Appliance {
    void turnOn() {
        System.out.println("Turning on the appliance.");
    }
}

class WashingMachine extends Appliance {
    void startWashing() {
        System.out.println("Starting the washing machine.");
    }
}

class SmartWashingMachine extends WashingMachine {
    void connectToWiFi() {
        System.out.println("Connecting the washing machine to WiFi.");
    }
}

public class MultilevelInheritanceExample5 {
    public static void main(String[] args) {
        SmartWashingMachine smartWM = new SmartWashingMachine();
        smartWM.turnOn();        
        smartWM.startWashing();  
        smartWM.connectToWiFi(); 
    }
}

