# Game Arena

This Java application simulates a simple game arena where two players engage in combat. The players, represented by the `Player` class, have attributes such as health, strength, and attack. The game mechanics are managed by the `GameArena` class, and dice rolling is handled by the `DiceService` class.

## How to Run

To run the game, execute the `GameArenaDriver` class. This class initializes two players, creates a game arena, and starts the game.

```java
public class GameArenaDriver {

    public static void main(String[] args) {
        Player a = new Player("A", 50, 5, 10);
        Player b = new Player("B", 100, 10, 5);

        GameArena game = new GameArena(a, b, 6);
        game.startGame();
    }
}
```

## Player Class

The `Player` class represents a player in the game. Each player has a name, health, strength, and attack attributes. The `DiceService` class is responsible for simulating dice rolls.

```java
public class Player {

    public Player(String name, int health, int strength, int attack) {
        // Constructor initializes player attributes
        // TODO: Validate constraints (name not null, health/strength/attack >= 0)
    }

    // Getters and setters for player attributes
    // TODO: Implement additional validation logic

}
```

## GameArena Class

The `GameArena` class orchestrates the game. It takes two players and the number of sides on the game dice as parameters. The game progresses through turns, and players attack and defend based on dice rolls.

```java
public class GameArena {

    public GameArena(Player a, Player b, int diceSides) {
        // Constructor initializes game arena with players and dice service
        // TODO: Validate constraints
    }

    public void startGame() {
        // Method to start and manage the game
        // TODO: Implement game logic
    }

}
```

## DiceService Class

The `DiceService` class simulates the rolling of a six-sided dice. It generates random numbers between 1 and 6.

```java
public class DiceService {

    public DiceService(int sides) {
        // Constructor initializes the number of sides on the dice
    }

    public int roll() {
        // Method to roll the dice and return a random number
    }

}
```
