package shiyan3;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter values for a, b, c, d, e, and f
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        System.out.print("Enter d: ");
        double d = input.nextDouble();
        System.out.print("Enter e: ");
        double e = input.nextDouble();
        System.out.print("Enter f: ");
        double f = input.nextDouble();

        // Create a LinearEquation object
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        // Check if the equation is solvable and display the results
        if (equation.isSolvable()) {
            System.out.println("x is " + equation.getX() + " and y is " + equation.getY());
        } else {
            System.out.println("The equation has no solution.");
        }

        input.close();
    }
}
