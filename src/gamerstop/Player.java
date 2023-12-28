package gamerstop;

public class Player {

    public Player(String name, int health, int strength, int attack) {
        if (name == null) {
            throw new IllegalArgumentException("Name can not be null");
        }
        if (health <= 0) {
            throw new IllegalArgumentException("Starting health can not be zero or negative");
        }
        if (strength <= 0) {
            throw new IllegalArgumentException("Strength can not be zero or negative");
        }
        if (attack <= 0) {
            throw new IllegalArgumentException("Attack can not be zero or negative");
        }
        // TODO: Write for health, strength and attack


        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    private String name;
    private int health;
    private int strength;
    private int attack;

    public String getName() {
    	return this.name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

}
