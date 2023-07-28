package templerun;

public class FireBall extends Obstacle{
    private int points;
    public FireBall(int points) {
        super("fireball", 30);
        this.points = points;
        if(points < 0 || points > 100) {
            throw new InvalidFireBallSpeedException();
        }
    }

    public void roll() {
        System.out.println("FireBall is rolled with " + points + " kmh speed!");

    }

    public class InvalidFireBallSpeedException extends RuntimeException {
    }
}
