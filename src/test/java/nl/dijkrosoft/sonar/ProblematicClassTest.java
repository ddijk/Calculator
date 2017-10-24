package nl.dijkrosoft.sonar;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 24/10/2017.
 */
public class ProblematicClassTest {

    @Test
    public void verifyInputContainsX() throws Exception {
        ProblematicClass instance = new ProblematicClass();
        assertTrue(instance.testIfContainsX("AXA"));
    }

    @Test
    public void verifyInputContainsNoX() throws Exception {
        ProblematicClass instance = new ProblematicClass();
        assertFalse(instance.testIfContainsX("ABC"));

    }
}