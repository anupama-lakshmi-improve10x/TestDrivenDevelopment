package namegreeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class NameGreetingTest {
    private NameGreeting nameGreeting;

    @BeforeEach

    public void setup() {
        nameGreeting = new NameGreeting();
    }

    @Test
    public void nothing() {

    }
    /*
    helloName("Gerald") ➞ "Hello Gerald!"

    helloName("Tiffany") ➞ "Hello Tiffany!"

     helloName("Ed") ➞ "Hello Ed!"
*/

    @Test
    public void givenHelloAndEmpty_returnHelloHelloEmpty() {

        String name = nameGreeting.helloName(null);
        assertEquals(null, name);
    }

    @Test
    public void givenEmptyName_returnEmpty() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.helloName("");
        assertEquals("", name);
    }
    @Test
    public void givenHelloAndName_returnHelloName() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.helloName("Gerald");
        assertEquals("Hello Gerald!", name);
    }

    @Test
    public void givenHelloAndName_returnGivenHelloName() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.helloName("Ed");
        assertEquals("Hello Ed!", name);
    }

    @Test
    public void givenHelloName_returnGivenHelloName() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.helloName("Anu");
        assertEquals("Hello Anu!", name);

    }

}
