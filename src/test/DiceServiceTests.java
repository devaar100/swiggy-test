package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import gamerstop.DiceService;

class DiceServiceTest {

    @Test
    public void testRoll() {
        int sides = 6; // Assuming a six-sided dice
        DiceService diceService = new DiceService(sides);

        for (int i = 0; i < 1000; i++) {
            int result = diceService.roll();

            // Ensure the result is within the valid range for a six-sided dice
            assertTrue(result >= 1 && result <= 6, "Invalid dice roll result: " + result);
        }
    }

    @Test
    public void testRollWithDifferentSides() {
        int sides = 10; // Assuming a ten-sided dice
        DiceService diceService = new DiceService(sides);

        for (int i = 0; i < 1000; i++) {
            int result = diceService.roll();

            // Ensure the result is within the valid range for a ten-sided dice
            assertTrue(result >= 1 && result <= 10, "Invalid dice roll result: " + result);
        }
    }

}
