package array.secondlargenumber;

public class SecondLargestNumber {
    public int findSecondLargestNumber(int[] arr) {
        int result = 0;
        if(arr == null) {
            return result;
        } else if(arr.length == 0) {
            return result;
        } else if(arr.length == 1) {
            result = Integer.MIN_VALUE;
        }
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                result = max;
            } else if(arr[i] > result && arr[i] != max) {
                result = arr[i];
            }
        }
        return result;
    }
}
