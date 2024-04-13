public class NumberFormatExceptExample {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("Kashi Don");

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
    }
}
