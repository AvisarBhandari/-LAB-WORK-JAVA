import java.util.Scanner;

class A {
    int roll;
    String name, address;
    Scanner sc = new Scanner(System.in);
}

class B extends A {
    void get() {
        System.out.println("Enter Roll Number, Name, Address: ");
        roll = sc.nextInt();
        name = sc.next();
        address = sc.next();
    }
}

class C extends B {
    void display() {
        System.out.println("\nRollno: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.get();
        obj.display();
    }
}
