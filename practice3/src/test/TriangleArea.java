package test;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three points
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculate the area of the triangle
        double area = Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2.0);

        // Display the result
        System.out.println("The area of the triangle is " + area);
    }
}

