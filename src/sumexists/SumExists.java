package sumexists;

public class SumExists {
    public String sumOfTwoArrays(int[] arr, int target) {
        if(arr == null || arr.length <= 1) {
            return "No";
        }
        int n = arr.length;
        for(int i =0; i < n; i++) {
            for(int j= i+1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    return "Yes";
                }
            }
        }
        return "No";
    }
}
