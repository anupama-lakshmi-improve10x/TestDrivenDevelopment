package specialarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SpecialArrayTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenFalseInput_returnFalse() throws SpecialArray.InvalidArrayException {
        SpecialArray specialArray = new SpecialArray();
        Boolean givenFalse = specialArray.isSpecialArray(new Integer[] {1,2,0,0});
        assertEquals(false,givenFalse);
    }

    @Test
    public void givenNullInput_returnFalse() {
        SpecialArray specialArray = new SpecialArray();
        assertThrows(SpecialArray.InvalidArrayException.class, () -> specialArray.isSpecialArray(null), "Invalid input");
    }

    @Test
    public void givenEmptyInput_returnFalse() {
        SpecialArray specialArray = new SpecialArray();
        assertThrows(SpecialArray.InvalidArrayException.class, () -> specialArray.isSpecialArray(new Integer[]{}), "Invalid input");
    }

    @Test
    public void givenArray_returnTrue() throws SpecialArray.InvalidArrayException {
        SpecialArray specialArray = new SpecialArray();
        Boolean givenArray = specialArray.isSpecialArray(new Integer[] {2, 7, 4, 9, 6, 1, 6, 3});
        assertEquals(true, givenArray);
    }

    @Test
    public void givenFalseArray_returnFalse() throws SpecialArray.InvalidArrayException {
        SpecialArray specialArray = new SpecialArray();
        Boolean givenArray = specialArray.isSpecialArray(new Integer[] {2, 7, 9, 1, 6, 1, 6, 3});
        assertEquals(false, givenArray);
    }

    @Test
    public void givenFalseInputArray_returnFalse() throws SpecialArray.InvalidArrayException {
        SpecialArray specialArray = new SpecialArray();
        Boolean givenArray = specialArray.isSpecialArray(new Integer[] {2, 7, 8, 8, 6, 1, 6, 3});
        assertEquals(false, givenArray);
    }


}
