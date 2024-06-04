package shiyan4;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        // Create an array with 100,000 random numbers
        int[] array = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100000);
        }

        // Create a StopWatch object
        StopWatch stopwatch = new StopWatch();

        // Start the stopwatch
        stopwatch.start();

        // Sort the array using selection sort
        selectionSort(array);

        // Stop the stopwatch
        stopwatch.stop();

        // Display the elapsed time
        System.out.println("The sorting time is " + stopwatch.getElapsedTime() + " milliseconds.");
    }

    // Selection sort method
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum in the array
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the elements
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
