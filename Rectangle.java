class Rectangle {
    int width;
    int height;
    
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    int area() {
        return width * height;
    }
    
    int perimeter() {
        return 2 * (width + height);
    }
}

public class Solution {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}
