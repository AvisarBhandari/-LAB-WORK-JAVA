class A {
    int a, b;

    void add(int x, int y) {
        a = x + 3;
        b = y + 3;
    }
}

public class PassByExample {
    int a = 5, b = 10;

    void add(PassByExample obj) {
        obj.a = obj.a + 3;
        obj.b = obj.b + 3;
    }

    public static void main(String args[]) {
        A objA = new A();
        PassByExample objB = new PassByExample();
        int a = 5, b = 10;

        // Pass by value
        System.out.println("Pass by value");
        System.out.println("Before function call a = " + a + " b = " + b);
        objA.add(a, b);
        System.out.println("After function call a = " + a + " b = " + b);

        // Pass by reference
        System.out.println(" Pass by reference");
        System.out.println("Before function call a = " + objB.a + " b = " + objB.b);
        objB.add(objB);
        System.out.println("After function call a = " + objB.a + " b = " + objB.b);
    }
}
