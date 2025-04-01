package nl.dijkrosoft.sonar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Created by dickdijk on 24/10/2017.
 */
class ProblematicClassTest {

    @Test
    void verifyInputContainsX() throws Exception {
        ProblematicClass instance = new ProblematicClass();
        assertTrue(instance.testIfContainsX("AXA"));
    }

    @Test
    void verifyInputContainsNoX() throws Exception {
        ProblematicClass instance = new ProblematicClass();
        assertFalse(instance.testIfContainsX("ABC"));

    }
}