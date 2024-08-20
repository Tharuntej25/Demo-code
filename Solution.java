class Student {
    String name;
    int age;
    double GPA;
    
    Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + GPA);
    }
}

public class Solution {
    public static void main(String[] args) {
        Student student = new Student("John", 20, 3.75);
        student.displayInfo();
    }
}
