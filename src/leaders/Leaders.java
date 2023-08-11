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
        } else {
            ArrayList<Integer> number = new ArrayList<>();
            n = num.length;
            for(int i = 0; i < n; i++) {
                boolean leader = true;
                for(int j = i + 1; j < n; j++) {
                    if(num[j] > num[i]) {
                        leader = false;
                        break;
                    }
                }
                if(leader) {
                    number.add(num[i]);
                }
            }
            return number;
        }
    }
}
