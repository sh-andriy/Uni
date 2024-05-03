package lab6java;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new LoggingProxyCalculator();
        int result = calculator.add(5, 3);
        System.out.println("Result: " + result);
    }
}
