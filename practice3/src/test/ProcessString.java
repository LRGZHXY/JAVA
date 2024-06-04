package test;

import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();  // Read the entire line as a string

        // Display the length of the string
        int length = text.length();
        System.out.println("Length of the string: " + length);

        // Display the first character of the string if it is not empty
        if (length > 0) {
            char firstChar = text.charAt(0);
            System.out.println("First character: " + firstChar);
        } else {
            System.out.println("The string is empty and has no first character.");
        }
    }
}

