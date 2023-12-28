package gamerstop;

public class GameArenaDriver {

    public static void main(String[] args) {
        Player a = new Player("A", 50,5,10);
        Player b = new Player("B", 100,10,5);

        GameArena game = new GameArena(a, b, 6);
        game.startGame();
    }
}
