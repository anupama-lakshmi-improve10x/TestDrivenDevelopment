package maximumedge;

public class MaximumEdgeOfTriangle {
    public int nextEdge(int side1, int side2) {
        if(side1 + side2 >= 0) {
            int edge = (side1 + side2) - 1;
            return edge;
        } else {
            return -1;
        }

    }
}
