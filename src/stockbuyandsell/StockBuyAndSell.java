package stockbuyandsell;

public class StockBuyAndSell {
    public int findMaxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return -1;
        } else if(prices.length == 1) {
            return 0;
        } else {
            int maxProfit = 0;
            for(int i = 0; i < prices.length; i++) {
                for(int j = i+1; j < prices.length; j++) {
                    if(prices[i] < prices[j] && maxProfit < prices[j] - prices[i]) {
                        maxProfit =prices[i] - prices[i];
                    }
                }
            }
            return maxProfit;
        }
    }
}
