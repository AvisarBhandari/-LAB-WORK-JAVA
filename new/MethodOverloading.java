import java.util.Scanner;

public class MethodOverloading {
    void area(int r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    void area(int l, int b) {
        System.out.print("Area of Rectangle: " + (l * b));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        Scanner sc = new Scanner(System.in);
        int length, breadth, radius;
        System.out.println("Enter radius of circle:");
        radius = sc.nextInt();
        obj.area(radius);
        System.out.println("Enter length and breadth of rectangle:");
        length = sc.nextInt();
        breadth = sc.nextInt();
        obj.area(length, breadth);
        sc.close();
    }
}
