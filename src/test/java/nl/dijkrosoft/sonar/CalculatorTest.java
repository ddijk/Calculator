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

}
