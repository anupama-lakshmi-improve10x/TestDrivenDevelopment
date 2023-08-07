package linearsearch;

public class LinearSearch {

    public int findLinearSearch(int[] num, int number) {
        if(num != null && num.length != 0) {
            int n = num.length;
            for(int i = 0; i < n; i++) {
                if(num[i] == number ) {
                    return i;
                }
            }
        }
        return -1;
    }
}
