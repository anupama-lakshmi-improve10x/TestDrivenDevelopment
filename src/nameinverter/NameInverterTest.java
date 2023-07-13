package nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class NameInverterTest {

    private  NameInverter nameInverter;


    @BeforeEach
    public void setup() {
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenEmptyString_returnEmptyString() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    // input: singleword(onlyname) output: name
    @Test
    public void givenSingleWord_returnsSingleWord() {
        String invertName = nameInverter.invertName("name");
        assertEquals("name", invertName);
    }

    @Test
    public void givenSingleWordEndSpace_returnsSingleWord() {
        String invertName = nameInverter.invertName("name   ");
        assertEquals("name", invertName);
    }

    @Test
    public void givenSingleWordBeginningSpace_returnsSingleWord() {
        String invertName = nameInverter.invertName("    name");
        assertEquals("name", invertName);
    }

    @Test
    public void givenFirstLast_returnInvertedName() {
        String invertedName = nameInverter.invertName("first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenHonorifics_ignoreHonorific() {
        String invertedName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenMrHonorifics_ignoreHonorific() {
        String invertedName = nameInverter.invertName("Mr. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenPostNominals_stayAtEnd() {
        String invertedName = nameInverter.invertName("first last Msc.");
        assertEquals("last, first Msc.", invertedName);
    }

    @Test
    public void givenMultiPostNominals_stayAtEnd() {
        String invertedName = nameInverter.invertName("first last Msc. phD");
        assertEquals("last, first Msc. phD", invertedName);
    }

    @Test
    public void integratedTest() {
        String invertedName = nameInverter.invertName("Mr. Bob Martins MTech. phD.");
        assertEquals("Martins, Bob MTech. phD.", invertedName);
    }
}
