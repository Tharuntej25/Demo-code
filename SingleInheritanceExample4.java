class Person {
    void speak() {
        System.out.println("PERSON IS SPEAKING");
    }
}

class Student extends Person {
    void write() {
        System.out.println("STUDENT IS WRITING");

    }
}

public class SingleInheritanceExample4 {
    public static void main (String [] args){
    Student student = new Student ();
    student.speak();
    student.write();
    }
}

