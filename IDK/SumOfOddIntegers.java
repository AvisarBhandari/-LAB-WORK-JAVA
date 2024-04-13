package Unit1;

import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array with the specified size
        int[] numbers = new int[size];

        // Populate the array with user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of odd integers
        int sumOfOddIntegers = 0;
        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is odd
                sumOfOddIntegers += num;
            }
        }

        // Display the result
        System.out.println("Sum of Odd Integers: " + sumOfOddIntegers);

        scanner.close();
    }
}
