package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import gamerstop.Player;

class PlayerTest {

    @Test
    public void testValidPlayer() {
        Player player = new Player("John", 100, 10, 5);

        assertEquals("John", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(5, player.getAttack());
    }

    @Test
    public void testNameNotNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Player(null, 100, 10, 5);
        });
    }

    @Test
    public void testHealthNotNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Player("Alice", -10, 10, 5);
        });
    }

    @Test
    public void testStrengthNotNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Player("Bob", 100, -5, 5);
        });
    }

    @Test
    public void testAttackNotNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Player("Eve", 100, 10, -3);
        });
    }
}
