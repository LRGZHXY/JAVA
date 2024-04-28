package test;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the amount as an integer representing dollars and cents
        System.out.print("Enter an amount in integer: ");
        int amount = input.nextInt();

        // Calculate the number of dollars and cents
        int dollars = amount / 100;
        int cents = amount % 100;

        // Display the result
        System.out.println("Your amount" + amount + " consists of");
        System.out.println("    " + dollars + " dollars");
        System.out.println("    " + cents + " cents");

        input.close();
    }
}

