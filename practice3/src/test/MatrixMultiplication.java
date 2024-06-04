package test;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        // Read the first matrix
        System.out.println("Enter matrix1 (3x3): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        // Read the second matrix
        System.out.println("Enter matrix2 (3x3): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = input.nextDouble();
            }
        }

        // Multiply the matrices
        double[][] result = multiplyMatrix(a, b);

        // Print the result
        System.out.println("The multiplication of the matrices is:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }
}
