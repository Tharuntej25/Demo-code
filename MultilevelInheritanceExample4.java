class Person {
    void showIdentity() {
        System.out.println("I am a person.");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("I am working.");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("I am managing.");
    }
}

public class MultilevelInheritanceExample4 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.showIdentity(); 
        manager.work();        
        manager.manage();       
    }
}
