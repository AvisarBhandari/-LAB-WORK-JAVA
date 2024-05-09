import java.util.Arrays;

public class SortCities {
    public static void main(String[] args) {
        // Array containing names of five cities
        String[] cities = { "Kathmandu", "Bangkok", "Tokyo", "Paris", "Sydney" };

        // Sorting the array in ascending order
        Arrays.sort(cities);

        // Displaying the sorted array
        System.out.println("Cities in ascending order:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
