package nl.dijkrosoft.sonar.casino;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    void rollTwoDice() {

        Die die = new Die();
        int[] rolls = die.rollTwoDice();
        assertNotNull(rolls);
        assertEquals(2, rolls.length);
        for (int roll : rolls) {
            assertTrue(roll >= 1 && roll <= 6, "roll out of range: " + roll);
        }
    }
}