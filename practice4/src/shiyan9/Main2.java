package shiyan9;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        // Prompt user to read the first integer
        while (!validInput) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = input.nextInt();
                validInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // Clear the invalid input
            }
        }

        validInput = false; // Reset for the second input

        // Prompt user to read the second integer
        while (!validInput) {
            try {
                System.out.print("Enter the second integer: ");
                num2 = input.nextInt();
                validInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // Clear the invalid input
            }
        }

        // Display the sum of the two integers
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        input.close();
    }
}

