package nl.dijkrosoft.sonar.casino;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    void rollTwoDice() {

        Die die = new Die();
        int[] rolls = die.rollTwoDice();
        assertNotNull(rolls);
        assertEquals(3, rolls.length);
    }
}