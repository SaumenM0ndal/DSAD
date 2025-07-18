package StockBuySell;

public class StockBuySellNaive {

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;

        //Outer loop to buy and inner to sell
        //We can only sell after buying so first day to sell can be i+1

        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}

//O(n^2) Time and O(1) Space