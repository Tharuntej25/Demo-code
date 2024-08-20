class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

public class Solution {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 50000.00);
        emp.displayInfo();
    }
}
