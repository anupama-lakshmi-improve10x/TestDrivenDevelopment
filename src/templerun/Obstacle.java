package templerun;

public class Obstacle {

    private String name;
    private int damage;
    public Obstacle(String name, int damage) {
        this.name = name == null ? "" : name.trim();
        if(damage < 0 || damage > 100) {
            throw new InvalidObstacleDamageException();
        } else {
            this.damage = damage;
        }
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void collide(Player player) {
        System.out.println(name + "has collide " + name + " and caused" + damage);
        player.reduceHealth(damage);
    }

    public class InvalidObstacleDamageException extends RuntimeException {
    }
}
