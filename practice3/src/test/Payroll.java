package test;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get employee information
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        // Calculate payroll
        double grossPay = hoursWorked * payRate;
        double federalWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        // Print payroll statement
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n", federalTaxRate * 100, federalWithholding);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stateTaxRate * 100, stateWithholding);
        System.out.println("Total Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
    }
}
