package templerun;

public class Player {

    private String name;
    private int health;
    private int totalCoinValue;
    private int score;
    public Player(String name) {
        this(name, 100);
    }

    public Player(String name, int health) {
        this.name = name == null ? "" : name.trim();
        if(health < 0 || health > 100) {
            throw new InvalidHealthException();
        }
            this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {

        score = totalCoinValue;
        return score;
    }

    public void collectCoin(Coin coin) {
        this.totalCoinValue += coin.getValue();
    }

    public void run() {
        System.out.println("Running...!");
    }

    public void jump() {
        System.out.println( name + " jumped to avoid obstacles!");
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }

    public class InvalidHealthException extends RuntimeException {
    }
}
