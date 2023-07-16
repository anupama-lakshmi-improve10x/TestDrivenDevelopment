package namegreeting;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class NameGreetingTest {

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
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.helloName("");
        assertEquals("Hello !", name);
    }
    @Test
    public void givenHelloAndName_returnHelloName() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.helloName("Gerald");
        assertEquals("Hello Gerald!", name);

    }

    @Test
    public void givenEmptyName_returnEmpty() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.helloName("");
        assertEquals("", name);
    }

    @Test
    public void givenHelloAndName_returnGivenHelloName() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.helloName("Ed");
        assertEquals("Hello Ed!", name);

    }

}
