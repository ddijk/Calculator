package nl.dijkrosoft.sonar;

import java.util.concurrent.atomic.AtomicLong;

public class MoneyConverter {
    /*
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

     */
    double convertToEuro(double value, String inputCurrency) {
        if (inputCurrency.equals("dollar")) {
            double rate = 0.926;
            return value * rate;
        }

        if (inputCurrency.equals("yen")) {
            // 1000 yen => 6.24 Euro
            double rate = 6.24 / 1000;
            return value * rate;
        }

        System.out.println("Unsupported currency");
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    Boolean isSameNumberValue(AtomicLong a, AtomicLong b) {
        return a.equals(b); // Noncompliant, this is true only if a == b
    }
}
