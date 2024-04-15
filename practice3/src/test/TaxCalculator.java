package test;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Enter the type of taxpayer (1: Single, 2: Married Joint, 3: Head of Household): ");
            int type = scanner.nextInt();

            System.out.print("Enter the salary: ");
            double salary = scanner.nextDouble();

            double tax = calculateTax(type, salary);
            System.out.printf("Tax payable: $%.2f%n", tax);

            System.out.print("Do you want to calculate tax again? (Y/N): ");
            String input = scanner.next();
            continueCalculation = input.equalsIgnoreCase("Y");
        }

        scanner.close();
    }

    public static double calculateTax(int type, double salary) {
        double tax = 0;

        if (type == 1) { // Single
            if (salary <= 6000) {
                tax = salary * 0.1;
            } else if (salary <= 27950) {
                tax = 600 + (salary - 6000) * 0.15;
            } else if (salary <= 67700) {
                tax = 3450 + (salary - 27950) * 0.27;
            } else if (salary <= 141250) {
                tax = 9470 + (salary - 67700) * 0.30;
            } else if (salary <= 307050) {
                tax = 25122 + (salary - 141250) * 0.35;
            } else {
                tax = 79722 + (salary - 307050) * 0.386;
            }
        } else if (type == 2) { // Married Joint
            // Calculate tax for Married Joint type
            // Use the same approach as for Single
        } else if (type == 3) { // Head of Household
            // Calculate tax for Head of Household type
            // Use the same approach as for Single
        }

        return tax;
    }
}
