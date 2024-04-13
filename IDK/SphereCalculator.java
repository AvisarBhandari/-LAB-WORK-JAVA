package Unit1;

import java.util.Scanner;

public class SphereCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the radius of the sphere from the user
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the sphere
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        // Calculate the volume of the sphere
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Display the results
        System.out.println("Surface Area of the Sphere: " + surfaceArea);
        System.out.println("Volume of the Sphere: " + volume);

        scanner.close();
    }
}
