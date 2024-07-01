package shiyan5;

public class MyPoint {
    private double x;
    private double y;

    // No-arg constructor
    public MyPoint() {
        this(0, 0);
    }

    // Constructor with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Method to calculate the distance to another MyPoint
    public double distance(MyPoint otherPoint) {
        return distance(otherPoint.x, otherPoint.y);
    }

    // Method to calculate the distance to specified coordinates
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Test program
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
    }
}
