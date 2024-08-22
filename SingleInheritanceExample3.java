class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void calculateArea() {
        System.out.println("Calculating the area of the circle");
    }
}

public class SingleInheritanceExample3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();         
        circle.calculateArea();
    }
}
