package nl.dijkrosoft.sonar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 16/11/16.
 */
public class CalculatorTest {


    @Test
    public void add() throws Exception {

        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1,2));
    }

}