package farmproblem;

public class Farm {

    public int findTotalLegs(int chickens, int cows, int pigs) {
        int chickenLegs = chickens * 2;
        int cowsLegs = cows * 4;
        int pigLegs = pigs * 4;
        int totalLegs = chickenLegs + cowsLegs + pigLegs;
        return totalLegs;
    }
}
