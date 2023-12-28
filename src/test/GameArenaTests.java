package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gamerstop.DiceService;
import gamerstop.GameArena;
import gamerstop.Player;

class GameArenaTest {

    private Player playerA;
    private Player playerB;
    private DiceServiceMock diceServiceMock;

    @BeforeEach
    public void setUp() {
        playerA = new Player("PlayerA", 100, 10, 5);
        playerB = new Player("PlayerB", 80, 8, 4);
        diceServiceMock = new DiceServiceMock();
    }

    @Test
    public void testStartGame() {
        // Set the dice service for the game
        GameArena gameArena = new GameArena(playerA, playerB, 6);

        // Execute the game
        gameArena.startGame();

        // Validate the game outcome based on mock rolls
        Assertions.assertTrue(playerB.getHealth() <= 0); // PlayerB should have 0 health, indicating defeat
        Assertions.assertTrue(playerA.getHealth() > 0); // PlayerA should have some remaining health
    }

    private static class DiceServiceMock extends DiceService {
        private int rollCount;

        public DiceServiceMock() {
            super(6); // Assuming a six-sided dice for simplicity
        }

        @Override
        public int roll() {
            rollCount++;
            return 4; // Mocking a constant roll value for simplicity
        }

        public int getRollCount() {
            return rollCount;
        }
    }
}
