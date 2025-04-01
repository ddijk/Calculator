package nl.dijkrosoft.sonar;

/**
 * Created by dickdijk on 22/06/2017.
 */
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
