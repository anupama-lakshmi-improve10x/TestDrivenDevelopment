package leftrotatearray;

public class LeftRotateArray {

    public int[] leftRotate(int[] arr, int n) {
        if(arr == null || arr.length == 0) {
            return new int[] {};
        } else {
            int temp = arr[0];
            for(int i = 1; i <n; i++) {
                arr[i -1] = arr[i];
            }
            arr[n-1] = temp;
        }
        return arr;
    }
}
