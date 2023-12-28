package gamerstop;

import java.util.Random;

public class DiceService {

    private final int sides;
    private final Random random;

    public DiceService(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("Sides must be greater than 0");
        }
        this.sides = sides;
        this.random = new Random();
    }

    public int roll() {
        // The game will have a six sided dice numbered from 1 to 6 and will always give a random number on rolling it.
        return random.nextInt(sides) + 1;
    }
}