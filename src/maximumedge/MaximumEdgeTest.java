package maximumedge;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class MaximumEdgeTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenTwoSidesZero_returnNegative() {
        MaximumEdgeOfTriangle maximumEdgeOfTriangle = new MaximumEdgeOfTriangle();
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(0, 0);
        assertEquals(-1, anotherEdge);
    }

    @Test
    public void givenTwoSides_returnThirdEdge() {
        MaximumEdgeOfTriangle maximumEdgeOfTriangle = new MaximumEdgeOfTriangle();
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(8, 10);
        assertEquals(17, anotherEdge);
    }

    @Test
    public void givenNegativeSides_returnNegative() {
        MaximumEdgeOfTriangle maximumEdgeOfTriangle = new MaximumEdgeOfTriangle();
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(-1, -2);
        assertEquals(-1, anotherEdge);
    }

    @Test
    public void givenTwoSides_returnMaximumEdge() {
        MaximumEdgeOfTriangle maximumEdgeOfTriangle = new MaximumEdgeOfTriangle();
        int anotherEdge = maximumEdgeOfTriangle.nextEdge(120, 160);
        assertEquals(279, anotherEdge);
    }

}
