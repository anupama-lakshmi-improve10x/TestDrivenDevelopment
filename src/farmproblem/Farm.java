package farmproblem;

public class Farm {

    public int findTotalLegs(int chickens, int cows, int pigs) {
        if(chickens >= 0 && cows >= 0 && pigs >= 0) {
            int chickenLegs = chickens * 2;
            int cowsLegs = cows * 4;
            int pigLegs = pigs * 4;
            int totalLegs = chickenLegs + cowsLegs + pigLegs;
            return totalLegs;
        } else {
            return -1;
        }

    }
}
