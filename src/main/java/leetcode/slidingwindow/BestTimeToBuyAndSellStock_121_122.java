package leetcode.slidingwindow;

public class BestTimeToBuyAndSellStock_121_122 {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int result = prices[i] - min;
                maxProfit = Math.max(maxProfit, result);
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int totalProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= min) {
                int profit = prices[i] - min;
                totalProfit = totalProfit + profit;
            }
            min = prices[i];
        }
        return totalProfit;
    }

    public static int maxProfit3(int[] prices) {
        int min = Integer.MAX_VALUE;
        int biggestProfit1 = 0;
        int biggestProfit2 = 0;
        int profit;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int result = prices[i] - min;
                biggestProfit1 = Math.max(biggestProfit1, result);
            }
        }
        return biggestProfit1 + biggestProfit2;
    }

}