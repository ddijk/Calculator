package nl.dijkrosoft.sonar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dickdijk on 16/11/16.
 */
public class CalculatorIT {

    @Test
    public void testSubtract() {

        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(5,2));
    }
}
