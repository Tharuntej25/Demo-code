class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing");
    }
}

public class SingleInheritanceExample2 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.work();   
        manager.manage(); 
    }
}
