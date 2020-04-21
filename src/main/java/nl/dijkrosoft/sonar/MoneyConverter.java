package nl.dijkrosoft.sonar;

public class MoneyConverter {
    public static double rate = 1.08;

    double convertToEuro(double value, String inputCurrency) {
        if (inputCurrency.equals("dollar")) {
            return value / rate;
        }

        System.out.println("Unsupported currency");
        throw new IllegalArgumentException("Unsupported currency");

    }
}
