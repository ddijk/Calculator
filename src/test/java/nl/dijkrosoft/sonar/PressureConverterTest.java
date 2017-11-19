package nl.dijkrosoft.sonar;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 22/06/2017.
 */
public class PressureConverterTest {
    @Test
    public void barToHectoPascal() throws Exception {
        PressureConverter pressureConverter = new PressureConverter();
        double actualResult = pressureConverter.barToHectoPascal(0.9);
        assertEquals(900, actualResult, 0.1);
    }

    @Test
    public void hectoPascalToBar() throws Exception {
        PressureConverter pressureConverter = new PressureConverter();
        double actualResult = pressureConverter.hectoPascalToBar(900);
        assertEquals(0.9, actualResult, 0.1);
    }

}