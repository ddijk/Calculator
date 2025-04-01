package nl.dijkrosoft.sonar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by dickdijk on 16/11/16.
 */
class CalculatorTest {


    @Test
    void add() throws Exception {

        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void multiply() throws Exception {

        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiply(1, 2));
    }

    @Test
    void divide() throws Exception {

        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.divide(6, 2), 0.1);
    }
}
