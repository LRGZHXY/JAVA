package test;

import java.util.Scanner;

public class CircleOverlap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input circle1 information
        System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        // Input circle2 information
        System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        // Calculate the distance between the centers of the two circles
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Determine the relationship between the two circles
        if (distance <= Math.abs(r1 - r2)) {
            System.out.println("circle2 is inside circle1");
        } else if (distance <= r1 + r2) {
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }

        input.close();
    }
}

