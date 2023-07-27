package encryption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class encryptTest {

    private Encryption encryption;

    @BeforeEach
    public void setup() {
       encryption = new Encryption();
    }

    @Test

    public void nothing() {
    }

    @Test
    public void givenNull_returnaca() {
        String nullValue = encryption.encrypt(null);
        assertEquals("aca", nullValue);
    }

    @Test
    public void givenEmpty_returnaca() {
        String emptyValue = encryption.encrypt("");
        assertEquals("aca", emptyValue);
    }

    @Test
    public void givenb_returnbaca() {
        String bValue = encryption.encrypt("b");
        assertEquals("baca", bValue);
    }

    @Test
    public void givenc_returncaca() {
        String cValue = encryption.encrypt("c");
        assertEquals("caca", cValue);
    }

    @Test
    public void givena_return0aca() {
        String aValue = encryption.encrypt("a");
        assertEquals("0aca", aValue);
    }

    @Test
    public void givene_return1aca() {
        String eValue = encryption.encrypt("e");
        assertEquals("1aca", eValue);
    }

    @Test
    public void giveni_return2aca() {
        String iValue = encryption.encrypt("i");
        assertEquals("2aca", iValue);
    }

    @Test
    public void giveno_return3aca() {
        String oValue = encryption.encrypt("o");
        assertEquals("3aca", oValue);
    }

    @Test
    public void givenu_return4aca() {
        String uValue = encryption.encrypt("u");
        assertEquals("4aca", uValue);
    }

    @Test
    public void givenbg_returngbaca() {
        String bgValue = encryption.encrypt("bg");
        assertEquals("gbaca", bgValue);
    }

    @Test
    public void givencg_returngbaca() {
        String cgValue = encryption.encrypt("cg");
        assertEquals("gcaca", cgValue);
    }

    @Test
    public void givenag_returngbaca() {
        String bgValue = encryption.encrypt("ag");
        assertEquals("g0aca", bgValue);
    }

    @Test
    public void giveneg_returng1aca() {
        String egValue = encryption.encrypt("eg");
        assertEquals("g1aca", egValue);
    }

    @Test
    public void givenig_returng2aca() {
        String igValue = encryption.encrypt("ig");
        assertEquals("g2aca", igValue);
    }

    @Test
    public void givenog_returng3aca() {
        String ogValue = encryption.encrypt("og");
        assertEquals("g3aca", ogValue);
    }

    @Test
    public void givenug_returng4aca() {
        String ugValue = encryption.encrypt("ug");
        assertEquals("g4aca", ugValue);
    }

    @Test
    public void givenAg_returng0aca() {
        String AgValue = encryption.encrypt("Ag");
        assertEquals("g0aca", AgValue);
    }

    @Test
    public void givenEg_returng1aca() {
        String EgValue = encryption.encrypt("Eg");
        assertEquals("g1aca", EgValue);
    }

    @Test
    public void givenIg_returng2aca() {
        String IgValue = encryption.encrypt("Ig");
        assertEquals("g2aca", IgValue);
    }

    @Test
    public void givenOg_returng3aca() {
        String OgValue = encryption.encrypt("Og");
        assertEquals("g3aca", OgValue);
    }

    @Test
    public void givenUg_returng4aca() {
        String UgValue = encryption.encrypt("Ug");
        assertEquals("g4aca", UgValue);
    }

    @Test
    public void givenapple_returngelpp0() {
        String appleValue = encryption.encrypt("apple");
        assertEquals("1lpp0aca", appleValue);
    }

    @Test
    public void givenbanana_return0n0n0baca() {
        String appleValue = encryption.encrypt("banana");
        assertEquals("0n0n0baca", appleValue);
    }

    @Test
    public void givenburak_returnk0r4baca() {
        String burakValue = encryption.encrypt("burak");
        assertEquals("k0r4baca", burakValue);
    }
}
