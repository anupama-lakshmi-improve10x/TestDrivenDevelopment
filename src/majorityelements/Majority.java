package majorityelements;

import org.junit.jupiter.api.Test;

public class Majority {

    public int findMajorityElement(int[] num) {
        if(num != null && num.length != 0) {
            int n = num.length;
            for(int i = 0; i < n; i++) {
                int count = 0;
                for(int j = 0; j < n; j++) {
                    if(num[i] == num[j]) {
                        count ++;
                    }
                }
                if(count > n/2) {
                    return num[i];
                }
            }
        }
        return -1;
    }
}
