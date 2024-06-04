package shiyan2;

public class QuadraticEquation {
    // Data fields
    private double a;
    private double b;
    private double c;

    // Constructor with arguments for a, b, and c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods for a, b, and c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to get the discriminant
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Method to get the first root
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }

    // Method to get the second root
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }
}
