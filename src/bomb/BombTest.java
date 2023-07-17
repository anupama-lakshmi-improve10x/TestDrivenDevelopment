package bomb;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class BombTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenBombWord_returnDuck() {
        Bomb bomb = new Bomb();
        String result = bomb.findTheBomb("There is a bomb.");
        assertEquals("Duck", result);
    }

    @Test
    public void givenWithoutBomb_returnRelax() {
        Bomb bomb = new Bomb();
        String result = bomb.findTheBomb("This goes boom!!!");
        assertEquals("Relax, there's no bomb.", result);
    }

    @Test
    public void givenLongSentenceWithBomb_returnDuck() {
        Bomb bomb = new Bomb();
        String result = bomb.findTheBomb("Hey, did you think there is a BOMB?");
        assertEquals("Duck", result);
    }

    @Test
    public void givenLongSentenceWithoutBomb_returnRelax() {
        Bomb bomb = new Bomb();
        String result = bomb.findTheBomb("This goes boom!!! This goes boom!!! This goes boom!!!");
        assertEquals("Relax, there's no bomb.", result);
    }

   }
