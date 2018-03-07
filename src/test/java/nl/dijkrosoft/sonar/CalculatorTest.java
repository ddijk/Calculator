package nl.dijkrosoft.sonar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 16/11/16.
 */
public class CalculatorTest {


    @Test
    public void testAdd() throws Exception {

        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testMultiply() throws Exception {

        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiply(1, 2));
    }

    @Test
    public void testDivide() throws Exception {

        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.divide(6, 2), 0.1);
    }
}
