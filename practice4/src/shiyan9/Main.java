package shiyan9;

abstract class GeometricObject {
    // Abstract method to get the area
    public abstract double getArea();
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of geometric objects (two circles and two rectangles)
        GeometricObject[] objects = {
                new Circle(5),
                new Circle(10),
                new Rectangle(4, 5),
                new Rectangle(2.5, 3.5)
        };

        // Compute and print the total area
        double totalArea = sumArea(objects);
        System.out.println("Total area: " + totalArea);
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject obj : a) {
            sum += obj.getArea();
        }
        return sum;
    }
}

