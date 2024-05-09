public class WrapperExample {
    public static void main(String[] args) {
        // Integer wrapper class example
        int intValue = 10;
        Integer integerValue = Integer.valueOf(intValue); // Wrapping int value into Integer object
        System.out.println("Integer Value: " + integerValue);

        // Double wrapper class example
        double doubleValue = 5.5;
        Double doubleObject = Double.valueOf(doubleValue); // Wrapping double value into Double object
        System.out.println("Double Value: " + doubleObject);
        
        // Unwrapping Integer and Double values
        int unwrappedIntValue = integerValue.intValue();
        double unwrappedDoubleValue = doubleObject.doubleValue();
        System.out.println("Unwrapped Integer Value: " + unwrappedIntValue);
        System.out.println("Unwrapped Double Value: " + unwrappedDoubleValue);
    }
}
