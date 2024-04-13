package Unit1;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20; // Number of Fibonacci numbers to generate
        long[] fibonacciNumbers = new long[n];

        // Generate the first 20 Fibonacci numbers
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        // Print the Fibonacci numbers
        System.out.println("First 20 Fibonacci Numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }

        // Compute and print the average of Fibonacci numbers
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += fibonacciNumbers[i];
        }
        double average = (double) sum / n;

        System.out.println("\nAverage of the first 20 Fibonacci Numbers: " + average);
    }
}
