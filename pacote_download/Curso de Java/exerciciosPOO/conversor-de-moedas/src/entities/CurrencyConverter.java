package entities;

public class CurrencyConverter {

    public static double iof = 0.06;

    public static double dollarConverter(double dollar, double real) {
        return real * dollar * (1.0 + iof);
    }
}
