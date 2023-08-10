package moveallzero;

import java.util.ArrayList;

public class MoveZerosEnd {
    public int[] moveAllZerosToEnd(int[] arr, int n) {
        if(arr == null || arr.length == 0) {
            return new int[] {};
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int x = arr.length;
        for(int i = 0; i < x; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
            int xy= temp.size();
            for( int i = 0; i <xy; i++) {
                arr[i] = temp.get(i);
            }
            for(int i = xy; i < n; i++) {
                arr[i] = 0;
            }
        return arr;
    }
}
