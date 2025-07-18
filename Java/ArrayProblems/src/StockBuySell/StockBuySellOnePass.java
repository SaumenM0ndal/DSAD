package StockBuySell;

public class StockBuySellOnePass {

    static int maxProfit(int[] prices) {

        int n = prices.length;
        int res = 0;
        int minSoFar = prices[0];  //initialize first element as min, a potential buy

        for(int i = 1; i < n; i++) { //from 1 cuz 0 is set to min for now

            minSoFar = Math.min(minSoFar, prices[i]);
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 11, 2};
        System.out.println(maxProfit(prices));
    }
}
// O(n) Time and O(1) Space