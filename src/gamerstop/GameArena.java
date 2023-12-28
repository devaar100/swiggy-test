package gamerstop;

public class GameArena {

    private Player first;
    private Player second;
    private DiceService diceService;
    private boolean gameOver;

    public GameArena(Player a, Player b, int diceSides) {

        if (a == null) {
            throw new IllegalArgumentException("Player A can not be null");
        }
        if (b == null) {
            throw new IllegalArgumentException("Player B can not be null");
        }

        first = a;
        second = b;
        diceService = new DiceService(diceSides);
        gameOver  = false;
    }

    public void startGame() {

        Player attacker;
        Player defender;

        if (first.getHealth() < second.getHealth()) {
            attacker = first;
            defender = second;
        } else {
            attacker = second;
            defender = first;
        }
        

        while (!gameOver) {

            System.out.println("Attacking player " + attacker.getName());
            int attackerRoll = diceService.roll();
            System.out.println(String.format("The dice value for attacker {%s} roll: {%d}",attacker.getName(),attackerRoll));

            System.out.println("Defending player " + defender.getName());
            int defenderRoll = diceService.roll();
            System.out.println(String.format("The dice value for defender {%s} roll: {%d}",defender.getName(),defenderRoll));

            int damage = attackerRoll * attacker.getAttack();
            int defenderVal = defenderRoll * defender.getStrength();

            if ((damage - defenderVal) > 0) {
                System.out.println(String.format("Defender player {%s} health reduced from {%d} to {%d}",defender.getName(), defender.getHealth(), defender.getHealth() - (damage - defenderVal)));
                defender.setHealth(defender.getHealth() - (damage - defenderVal));
            } else {
                System.out.println(String.format("Defender player {%s} with health {%d} took no damage",defender.getName(), defender.getHealth()));
            }

            System.out.println("-----------------------------------");
            
            if (defender.getHealth() <= 0) {
            	System.out.println("The WINNER Is: " + attacker.getName());
                System.out.println("Game over");
                gameOver = true;
            }

            // Swapping attacker and defender
            Player temp = defender;
            defender = attacker;
            attacker = temp;
        }
    }
}
