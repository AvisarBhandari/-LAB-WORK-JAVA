import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        // String array to be sorted
        String[] stringArray = { "banana", "apple", "grape", "orange", "pineapple" };

        // Sorting the string array
        Arrays.sort(stringArray);
        

        // Displaying the sorted array
        System.out.println("Sorted String Array:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
