package test;

import java.util.Arrays;
import java.util.Random;

public class ExecutionTimeComparison {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random random = new Random();

        // Populate the array with random numbers and select a random key
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);  // Arbitrary large range for random numbers
        }

        // Select a random key from the array
        int key = numbers[random.nextInt(numbers.length)];

        // Measure execution time of linear search
        long startTime = System.currentTimeMillis();
        int indexLinear = linearSearch(numbers, key);
        long endTime = System.currentTimeMillis();
        long executionTimeLinear = endTime - startTime;
        System.out.println("Linear search execution time: " + executionTimeLinear + " milliseconds");

        // Sort the array
        Arrays.sort(numbers);

        // Measure execution time of binary search
        startTime = System.currentTimeMillis();
        int indexBinary = binarySearch(numbers, key);
        endTime = System.currentTimeMillis();
        long executionTimeBinary = endTime - startTime;
        System.out.println("Binary search execution time: " + executionTimeBinary + " milliseconds");
    }

    // Linear search method
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;  // Key found
            }
        }
        return -1;  // Key not found
    }

    // Binary search method
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;  // Key found
            }
        }
        return -1;  // Key not found
    }
}
