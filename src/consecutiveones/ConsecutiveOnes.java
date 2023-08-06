package consecutiveones;

public class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] arr) {

        if(arr == null || arr.length == 0) {
            return 0;
        } else if(arr.length == 1) {
            return 1;
        }
        int max = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]== 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        };
        return max;
    }
}
