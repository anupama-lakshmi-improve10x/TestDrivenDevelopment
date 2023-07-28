package templerun;

public class SpikePit extends Obstacle{

    private int points;
    public SpikePit(int points) throws InvalidSpikePitException, InvalidObstacleDamageException{
        super("spikePit", 40);
        if(points < 0 || points > 20) {
            throw new InvalidSpikePitException();
        }
        this.points = points;
    }

    public void trap(Player player) {
        System.out.println("name" + " trapped " + player.getName() + " inside!. it is " + points + " meters wide");
        player.reduceHealth(damage);
    }

    public class InvalidSpikePitException extends RuntimeException {
    }
}
