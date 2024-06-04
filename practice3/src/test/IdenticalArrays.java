package test;

import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the first array
        System.out.print("Enter list1: ");
        int size1 = input.nextInt(); // number of elements in the first list
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }

        // Read the second array
        System.out.print("Enter list2: ");
        int size2 = input.nextInt(); // number of elements in the second list
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        // Display the result
        System.out.println("Two lists are" + (equal(list1, list2) ? "" : " not") + " identical");
    }

    public static boolean equal(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
