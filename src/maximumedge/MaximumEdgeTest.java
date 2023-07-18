package maximumedge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class MaximumEdgeTest {
    private MaximumEdgeOfTriangle maximumEdgeOfTriangle;

    @BeforeEach

    public void setup() {
         maximumEdgeOfTriangle = new MaximumEdgeOfTriangle();
    }


    @Test
    public void nothing() {

    }

    @Test
    public void givenTwoSidesNegative_returnNegative() {
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(-1, -2);
        assertEquals(-1, anotherEdge);
    }

    @Test
    public void givenOnePositiveAndOtherNegative_returnNegative() {
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(1, -2);
        assertEquals(-1, anotherEdge);
    }

    @Test
    public void givenOneNegativeAndOtherPositive_returnNegative() {
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(-3, 2);
        assertEquals(-1, anotherEdge);
    }

    @Test
    public void givenTwoSidesZero_returnNegative() {
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(0, 0);
        assertEquals(0, anotherEdge);
    }

    @Test
    public void givenOneSideNumberAndOtherSidesZero_returnNegative() {
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(3, 0);
        assertEquals(0, anotherEdge);
    }

    @Test
    public void givenOneSideZeroAndOtherSidesNumber_returnNegative() {
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(0, 8);
        assertEquals(0, anotherEdge);
    }

    @Test
    public void givenTwoSides_returnThirdEdge() {
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(8, 10);
        assertEquals(17, anotherEdge);
    }

    @Test
    public void givenTwoSides_returnMaximumEdge() {
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(120, 160);
        assertEquals(279, anotherEdge);
    }

}
