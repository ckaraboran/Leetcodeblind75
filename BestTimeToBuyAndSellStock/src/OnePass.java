/*
It's very easy because it does not ask for the place of the values. It only asks the max difference.
Complexity Analysis:
Time complexity: O(n)
Space complexity O(1)
 */
public class OnePass implements StockBuyer {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
