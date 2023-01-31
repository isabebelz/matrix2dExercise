package application;

import java.util.Scanner;

public class ProgramMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Now, type the number of columns: ");
        int column = sc.nextInt();

        Integer[][] matrix = new Integer[row][column];

        System.out.println();
        System.out.println("Enter the numbers of matrix");
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        System.out.print("Type a number existent in the matrix: ");
        int number = sc.nextInt();

        System.out.println();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(number == matrix[i][j]) {
                    System.out.println("Position: [" + i + ", " + j + "]");
                    if(j - 1 >= 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if(j + 1 < matrix[i].length) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if(i  + 1 < matrix.length) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                    if(i - 1 >= 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
