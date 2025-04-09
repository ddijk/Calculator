package nl.dijkrosoft.sonar;

public class MoneyConverter {

    double convertToEuro(double value, String inputCurrency) {
        if (inputCurrency.equals("dollar")) {
            double rate = 0.926;
            return value*rate;
        }

        if (inputCurrency.equals("yen")) {
            // 1000 yen => 6.24 Euro
            double rate = 6.24/1000;
            return value*rate;
        }

        System.out.println("Unsupported currency");
        return value;

    }
}
