package areaoftriangle;

public class AreaOfTriangle {
    public int convert(int base, int height) {
        int result = Integer.MIN_VALUE;
        if(base <0 || height < 0) {
            return result;
        } else if(base == 0 || height == 0) {
            result = 0;
        } else if(base > 0 && height > 0) {
            result = base * height /2;
        }
        return result;
    }
}
