class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}

public class Solution {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        System.out.println("Distance to origin: " + point.distanceToOrigin());
    }
}
