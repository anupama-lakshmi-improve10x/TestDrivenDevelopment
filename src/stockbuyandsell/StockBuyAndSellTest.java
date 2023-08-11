package stockbuyandsell;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class StockBuyAndSellTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnMinusOne() {
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int result = stockBuyAndSell.findMaxProfit(null);
        assertEquals(-1, result);
    }

    @Test
    public void givenEmpty_returnMinusOne() {
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int result = stockBuyAndSell.findMaxProfit(new int[] {});
        assertEquals(-1, result);
    }

    @Test
    public void givenZeroValue_returnZero() {
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int result = stockBuyAndSell.findMaxProfit(new int[] {0});
        assertEquals(0, result);
    }

    @Test
    public void givenOneValue_returnZero() {
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int result = stockBuyAndSell.findMaxProfit(new int[] {1});
        assertEquals(0, result);
    }

    @Test
    public void givenOneZeroValue_returnZero() {
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int result = stockBuyAndSell.findMaxProfit(new int[] {0, 1});
        assertEquals(0, result);
    }

    @Test
    public void givenZeroOneValue_returnZero() {
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int result = stockBuyAndSell.findMaxProfit(new int[] {1, 0});
        assertEquals(0, result);
    }
}
