package ArraysProblems.LeetCode121;

public class BuySellStocks {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minvalue=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            minvalue=Math.min(minvalue,prices[i]);
            maxProfit=Math.max(maxProfit, prices[i]-minvalue);
        }
        return maxProfit;
    }
}
