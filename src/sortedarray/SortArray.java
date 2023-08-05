package sortedarray;

public class SortArray {


    public boolean isSorted(int[] arr) {
        boolean result = false;
        if(arr == null) {
            return result;
        } else if(arr.length == 1) {
            result = true;
        } else if(arr.length > 1) {
            for(int i = arr.length -1; i >= 0; i--) { // 4, 4>=0, 3
                for(int j = 0; j < i; j++) { // 0, 0 <3,
                    if(arr[i] < arr[j]) {
                        return false;
                    }
                }
            }
            result = true;
        }
        return result;
    }
}
