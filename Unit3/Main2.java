class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Name: " + name);
        System.out.println("Taste: " + taste);
    }
}

class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Name: " + name);
        System.out.println("Taste of apple: " + taste);
    }
}

class Orange extends Fruit {
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Name: " + name);
        System.out.println("Taste of orange: " + taste);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Apple apple = new Apple("Apple", "Sweet", "Medium");
        System.out.println("Eating an apple:");
        apple.eat();

        System.out.println();

        Orange orange = new Orange("Orange", "Tangy", "Medium");
        System.out.println("Eating an orange:");
        orange.eat();
    }
}
