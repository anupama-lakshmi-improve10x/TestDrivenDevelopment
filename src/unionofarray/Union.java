package unionofarray;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {


    public ArrayList<Integer> findUnion(Integer num[], Integer[] integer) {
        ArrayList<Integer> union = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        if(num == null && integer == null || num.length == 0 && integer.length == 0) {
            return new ArrayList<>();
        }
        int n = num.length;
        for(int i = 0; i < n; i++) {
            set.add(num[i]);
        }
        int m = integer.length;
        for(int i = 0; i < m; i++) {
            set.add(integer[i]);
        }
        for(int u: set) {
            union.add(u);
        }
        return union;
    }
}
