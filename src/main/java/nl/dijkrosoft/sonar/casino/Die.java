package nl.dijkrosoft.sonar.casino;

import java.util.Random;

public class Die {

    public int[] rollTwoDice() {
        Random random = new Random();
        return random.ints(2, 1, 7).toArray();
    }

    public static void main(String[] args) {
        Die die = new Die();
        int[] result = die.rollTwoDice();
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
