package leaders;

import java.util.ArrayList;

public class Leaders {
    public ArrayList<Integer> findLeaders(int[] num, int n) {
        if(num == null || num.length == 0) {
            return new ArrayList<>();
        } else if(num.length == 1) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(0);
            return result;
        }
        return null;
    }
}
