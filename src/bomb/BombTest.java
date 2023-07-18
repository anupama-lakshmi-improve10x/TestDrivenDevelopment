package bomb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class BombTest {

    private Bomb bomb;

    @BeforeEach
    public void setup() {
        bomb = new Bomb();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnRelax() {
        String result = bomb.findTheBomb(null);
        assertEquals(null, result);
    }

    @Test
    public void givenEmpty_returnRelax() {
        String result = bomb.findTheBomb("");
        assertEquals("", result);
    }

    @Test
    public void givenBombWord_returnDuck() {
        String result = bomb.findTheBomb("There is a bomb.");
        assertEquals("Duck", result);
    }

    @Test
    public void givenWithoutBomb_returnRelax() {
        String result = bomb.findTheBomb("This goes boom!!!");
        assertEquals("Relax, there's no bomb.", result);
    }

    @Test
    public void givenLongSentenceWithBomb_returnDuck() {
        String result = bomb.findTheBomb("Hey, did you think there is a BOMB?");
        assertEquals("Duck", result);
    }

    @Test
    public void givenLongSentenceWithoutBomb_returnRelax() {
        String result = bomb.findTheBomb("This goes boom!!! This goes boom!!! This goes boom!!!");
        assertEquals("Relax, there's no bomb.", result);
    }
   }
