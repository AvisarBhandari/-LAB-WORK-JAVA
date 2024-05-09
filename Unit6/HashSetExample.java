
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> courseSet = new HashSet<>();

        // Adding elements to the HashSet
        courseSet.add("BCA");
        courseSet.add("BBA");
        courseSet.add("BSCCSIT");
        courseSet.add("BE");

        // Displaying the HashSet
        System.out.println("Courses in HashSet:");
        for (String course : courseSet) {
            System.out.println(course);
        }
    }
}
