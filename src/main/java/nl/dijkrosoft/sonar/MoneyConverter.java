package nl.dijkrosoft.sonar;

public class MoneyConverter {

    double convert(double value, String inputCurrency) {
        if (inputCurrency.equals("dollar")) {
            double rate = 0.926;
            return value*rate;
        }

        System.out.println("Unsupported currency");
        return value;

    }
}
