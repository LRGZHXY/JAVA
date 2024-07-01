package shiyan9;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // Step 1: Create an array with 100 randomly chosen integers
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000); // Random integers between 0 and 999
        }

        // Step 2: Prompt the user to enter the index of the array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the array (0-99): ");

        // Step 3: Handle the ArrayIndexOutOfBoundsException
        try {
            int index = input.nextInt();
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input. Please enter an integer.");
        }

        input.close();
    }
}

