package nl.dijkrosoft.sonar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyConverterTest {

    @Test
    void convertDollar() throws Exception {

        MoneyConverter moneyConverter = new MoneyConverter();
        double actualResult = moneyConverter.convert(3.5, "dollar");
        assertEquals(3.24, actualResult, 0.1);
    }

    @Test
    void convertNonDollar() throws Exception {
        MoneyConverter moneyConverter = new MoneyConverter();
        double actualResult = moneyConverter.convert(3.5, "mark");
        assertEquals(3.5, actualResult, 0.1);
    }


}