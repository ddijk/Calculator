package nl.dijkrosoft.sonar;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 22/06/2017.
 */
public class MoneyConverterTest {

    @Test
    public void convertDollar() throws Exception {

        MoneyConverter moneyConverter = new MoneyConverter();
        double actualResult = moneyConverter.convert(3.5, "dollar");
        assertEquals(1.75, actualResult, 0.1);
    }
    @Test
    public void convertNonDollar() throws Exception {
        MoneyConverter moneyConverter = new MoneyConverter();
        double actualResult = moneyConverter.convert(3.5, "mark");
        assertEquals(3.5, actualResult, 0.1);
    }


}