package test;

import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the investment amount
        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();

        // Prompt for and read the annual interest rate as a percentage
        System.out.print("Enter monthly interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        // Prompt for and read the number of years
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Calculate the future investment value
        double futureInvestmentValue = calculateFutureInvestmentValue(investmentAmount, annualInterestRate, years);

        // Display the result formatted to two decimal places
        System.out.printf("Accumulated value is $%.2f\n", futureInvestmentValue);

        // Close the scanner
        scanner.close();
    }

    public static double calculateFutureInvestmentValue(double investmentAmount, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfMonths = years * 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}