package largestnumber;

public class LargestNumber {
    public int findLagerNumber(int[] num) {
        int result= 0;
        if(num == null) {
            result = 0;
        } else if (num.length == 0) {
            result = 0;
        } else if(num.length == 1) {
            result = num[0];
        } else {
            result = num[0];
            for (int i = 0; i< num.length; i++) {
                if(num[i] > result) {
                    result = num[i];
                }
            }
        }
        return result;
    }
}
