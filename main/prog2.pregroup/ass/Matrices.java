package ass;

import java.util.Scanner;

public class Matrices {
    public int[][] matrixA;
    public int[][] matrixB;
    public int row;
    public int column;

    public static int MatrixSizeCollumn() {
        Scanner kbd = new Scanner(System.in);
        int column;
        System.out.println("\nPlease Enter number of columns:");
        column = Integer.parseInt(kbd.nextLine());
        return column;
    }

    public static int MatrixSizeRow() {
        Scanner kbd = new Scanner(System.in);
        int row;
        System.out.println("\nPlease Enter number of rows:");
        row = Integer.parseInt(kbd.nextLine());

        return row;
    }

    public static int[][] ElementMatrixA(int row, int column) {
        System.out.println("Waldo was here");
        Scanner kbd = new Scanner(System.in);
        int[][] matrixA = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int x = 0; x < column; x++) {
                System.out.println("Enter the value of row " + i + " and column " + x + " for matrixA");
                matrixA[i][x] = kbd.nextInt();
            }
        }
        System.out.println("Here is your created elements in Matrix A");
        return matrixA;
    }

    public static int[][] ElementMatrixB(int row, int column) {
        System.out.println("Waldo was here");
        Scanner kbd = new Scanner(System.in);
        int[][] matrixB = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int x = 0; x < column; x++) {
                System.out.println("Enter the value of row " + i + " and column " + x + " for matrixB");
                matrixB[i][x] = kbd.nextInt();
            }
        }
        System.out.println("Here is your created elements in Matrix B");
        return matrixB;
    }

    public static void AddMatrixAnB(int row, int column, int[][] matrixA, int[][] matrixB) {
        Scanner kbd = new Scanner(System.in);
        int[][] result = new int[row][column];
        for (int x = 0; x <= row - 1; x++) {
            for (int i = 0; i <= column - 1; i++) {
                result[x][i] = matrixA[x][i] + matrixB[x][i];
            }
        }
        for (int x = 0; x <= row - 1; x++) {
            for (int i = 0; i <= column - 1; i++) {
                System.out.print(result[x][i] + " ");
                if (i == column - 1) {
                    System.out.println("");
                }
            }
        }
        System.out.println("Print any key to continue");
        kbd.nextLine();

    }

    public static void SubtractMAnB() {
    }

    public static void MultiplyMAnB(int row, int column, int[][] matrixA, int[][] matrixB) {
        Scanner kbd = new Scanner(System.in);
        if (row != column) {
            System.out.println("Problem cannot be performed");
            System.exit(0);
        }
        int[][] matrixC = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < row; k++) {
                    matrixC[i][j] = matrixC[i][j] + matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("The product of the two matrices is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Print any key to continue");
        kbd.nextLine();
    }

    public static void DisplayTranspose() {
    }

    public static void DisplayDeterminants() {
    }
}

