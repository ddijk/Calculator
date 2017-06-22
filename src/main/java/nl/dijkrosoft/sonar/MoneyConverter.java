package nl.dijkrosoft.sonar;

/**
 * Created by dickdijk on 22/06/2017.
 */
public class MoneyConverter {

    double convert(double value, String inputCurrency) {
        if ( inputCurrency.equals( "dollar" )) {
            return value/2;
        }

        System.out.println("Unsupported currency");
        return value;

    }
}
