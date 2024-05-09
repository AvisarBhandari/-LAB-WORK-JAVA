import java.util.Arrays;

public class SortNumericArray {
    public static void main(String[] args) {
        // Numeric array to be sorted
        int[] numericArray = { 5, 2, 9, 1, 7, 3 };

        // Sorting the numeric array
        Arrays.sort(numericArray);

        // Displaying the sorted array
        System.out.println("Sorted Numeric Array:");
        for (int num : numericArray) {
            System.out.print(num + " ");
        }
    }
}
