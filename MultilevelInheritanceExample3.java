class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle.");
    }
}

class ColoredCircle extends Circle {
    void fillColor() {
        System.out.println("Filling the circle with color.");
    }
}

public class MultilevelInheritanceExample3 {
    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle();
        coloredCircle.draw();       
        coloredCircle.drawCircle(); 
        coloredCircle.fillColor();  
}
