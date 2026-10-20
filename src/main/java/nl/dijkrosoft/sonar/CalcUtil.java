package nl.dijkrosoft.sonar;

import java.math.BigDecimal;

public class CalcUtil {

    static boolean comparePrices(String val1, String val2) {
        BigDecimal priceA = new BigDecimal(val1);
        BigDecimal priceB = new BigDecimal(val2);
        return priceA.equals(priceB);
    }

    static void main() {
        System.out.println("Prices are equal? " + comparePrices("10.0", "10.00"));
    }

}
