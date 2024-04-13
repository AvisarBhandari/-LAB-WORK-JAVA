package Unit1;

import java.util.Scanner;

public class JaggedArraySumRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows for the jagged array
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Initialize the jagged array
        int[][] jaggedArray = new int[numRows][];

        // Populate the jagged array with user input for each row
        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter the number of elements for row " + (i + 1) + ": ");
            int numElements = scanner.nextInt();

            jaggedArray[i] = new int[numElements];

            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < numElements; j++) {
                System.out.print("Element " + (j + 1) + ": ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Display the jagged array and the sum of each row
        System.out.println("\nJagged Array with Sum of Each Row:");

        for (int i = 0; i < numRows; i++) {
            int rowSum = 0;
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
                rowSum += jaggedArray[i][j];
            }
            System.out.println("=> Sum of Row " + (i + 1) + ": " + rowSum);
        }

        scanner.close();
    }
}
