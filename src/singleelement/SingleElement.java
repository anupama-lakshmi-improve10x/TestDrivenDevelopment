package singleelement;

public class SingleElement {
    public int getSingleElement(int[] arr) {
        if(arr == null  || arr.length == 0) {
            return -1;
        } else if(arr.length == 1) {
            return 1;
        }
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for(int j= 0; j < n; j++) {
                if(arr[j] == num) {
                    count++;
                }
            }
            if(count == 1) {
                return num;
            }
        }
        return -1;
    }
}
