package Unit1;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
