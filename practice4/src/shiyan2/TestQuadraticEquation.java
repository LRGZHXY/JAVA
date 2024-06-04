package shiyan2;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter values for a, b, and c
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        // Create a QuadraticEquation object
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Get the discriminant
        double discriminant = equation.getDiscriminant();

        // Display the results based on the discriminant
        if (discriminant > 0) {
            System.out.println("The equation has two roots: " +
                    equation.getRoot1() + " and " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }

        input.close();
    }
}
