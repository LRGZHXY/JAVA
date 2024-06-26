package shiyan3;

public class LinearEquation {
    // Data fields
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // Constructor with arguments for a, b, c, d, e, and f
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter methods for a, b, c, d, e, and f
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // Method to check if the equation is solvable
    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    // Method to get the value of x
    public double getX() {
        if (isSolvable()) {
            return (e * d - b * f) / (a * d - b * c);
        } else {
            return 0; // Return 0 if the equation is not solvable
        }
    }

    // Method to get the value of y
    public double getY() {
        if (isSolvable()) {
            return (a * f - e * c) / (a * d - b * c);
        } else {
            return 0; // Return 0 if the equation is not solvable
        }
    }
}
