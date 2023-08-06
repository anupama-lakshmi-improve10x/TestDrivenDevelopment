package missingnumber;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        if(arr == null || arr.length == 0) {
            return 0;
        } else if(arr.length == 1) {
            return 1;
        }
       n = arr.length;
        int missingNumber = n * (n + 1) / 2;
        int number = 0;
        for(int i = 0; i < n-1; i++) {
            number += arr[i];
        }
        int result = missingNumber - number;
        return result ;
        }
    }
