package lab6java;

public class LoggingProxyCalculator implements Calculator {
    private RealCalculator realCalculator;

    public LoggingProxyCalculator() {
        this.realCalculator = new RealCalculator();
    }

    @Override
    public int add(int a, int b) {
        System.out.println("Adding " + a + " and " + b);
        return realCalculator.add(a, b);
    }
}
