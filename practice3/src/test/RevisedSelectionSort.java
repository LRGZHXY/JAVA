package test;

import java.util.Scanner;

public class RevisedSelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store 10 double numbers

        // Input 10 double numbers
        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Invoke the revised selection sort method
        selectionSort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Revised selection sort to find the largest and swap with the last
    public static void selectionSort(double[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            // Find the largest element in the subarray [0, i]
            int largestIndex = 0; // Start with the first element
            for (int j = 1; j <= i; j++) {
                if (array[j] > array[largestIndex]) {
                    largestIndex = j;
                }
            }

            // Swap the largest found with the element at index i
            double temp = array[largestIndex];
            array[largestIndex] = array[i];
            array[i] = temp;
        }
    }
}