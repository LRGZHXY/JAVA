package shiyan5;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    // No-arg constructor
    public Circle2D() {
        this(0, 0, 1);
    }

    // Constructor with specified coordinates and radius
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to check if a point is inside the circle
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance < radius;
    }

    // Method to check if a circle is inside this circle
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return distance + circle.radius < this.radius;
    }

    // Method to check if a circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return distance < this.radius + circle.radius && distance > Math.abs(this.radius - circle.radius);
    }

    // Test program
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("Circle c1: center=(" + c1.getX() + ", " + c1.getY() + "), radius=" + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

