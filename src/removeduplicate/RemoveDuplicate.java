package removeduplicate;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4};
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int [] num) {
        if(num == null || num.length == 0) {
            return 0;
        } else if(num.length == 1) {
            return 1;
        }
        int i = 0;
        for(int j = 1; j < num.length; j++) {
            if(num[i] !=  num[j]){
                i++;
                num [i] = num [j];
            }
        }
        return i + 1;
    }
}
