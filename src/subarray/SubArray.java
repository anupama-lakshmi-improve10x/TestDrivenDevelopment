package subarray;

public class SubArray {
    public int findSumOfSubArray(int[] num, int k) {
        if (num == null || num.length == 0) {
            return -1;
    } else {
            int n = num.length;
            int count = 0;
            for(int i = 0; i < n; i++) {
                int sum = 0;
                for(int j = i; j < n; j++) {
                    sum += num[j];
                    if(sum == k) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
