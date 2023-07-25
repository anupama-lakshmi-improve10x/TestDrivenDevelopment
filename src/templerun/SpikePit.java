package templerun;

public class SpikePit {

    private int points;
    public SpikePit(int points) {
        this.points = points;
        if(points < 0 || points > 20) {
            throw new InvalidSpikePitException();
        }
    }

    public void trap() {
        System.out.println("SpikePit is trapped with " + points + " meters width!");
    }

    public class InvalidSpikePitException extends RuntimeException {
    }
}
