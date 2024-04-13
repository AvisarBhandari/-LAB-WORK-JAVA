import java.util.Scanner;

public class ExceptionExamples {
    public static void main(String[] args) {
        // Example of NullPointerException
        String str = null;
        try {
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        // Example of NumberFormatException
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            String input = scanner.next();
            int number = Integer.parseInt(input);
            System.out.println("Square of the number: " + (number * number));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format");
        }
        scanner.close();
    }
}
