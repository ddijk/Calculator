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
        double actualResult = moneyConverter.convertToEuro(108, "dollar");
        assertEquals(100, actualResult, 0.1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void convertNonDollar() throws Exception {
        MoneyConverter moneyConverter = new MoneyConverter();
        moneyConverter.convertToEuro(3.5, "mark");
    }


}