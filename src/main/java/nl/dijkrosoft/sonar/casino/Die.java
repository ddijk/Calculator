package nl.dijkrosoft.sonar.casino;

import java.util.Arrays;
import java.util.Random;

public class Die {

    public int[] rollTwoDice() {
        Random random = new Random();
        return random.ints(2, 1, 7).toArray();
    }

    public static void main(String[] args) {
        Die die = new Die();
        int[] result = die.rollTwoDice();
        System.out.println("You rolled 2 dice, the result is '%d' and '%d'".formatted(result[0], result[1]));

        int score = die.calculateScore(result[0], result[1]);
        System.out.println("Your score is: " + score);
    }

    public int calculateScore(int k, int j) {
       return Arrays.stream(new int[]{k, j}).sum();
    }
}
