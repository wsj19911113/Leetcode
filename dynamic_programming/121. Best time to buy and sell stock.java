/* 121. Best time to buy and sell stock
    buy: prices[i]: min{prices[k]}, k<=i
    sell: prices[i]: max{prices[k]}, k>=j
    keep tracking the min price so far

    L[i]: lowest price up to i-th day
    P[i]: max profit up to i-th day
    P[i] = max {P[i-1], prices[i] - L[i-1]}

    buy at the lowest price and sell at i-th day

*/

class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        if(size <= 1){
            return 0;
        }
        int[] minPrice = new int[size];
        int[] maxProfit = new int[size];
        minPrice[0] = prices[0];
        maxProfit[0] = 0;

        for(int i = 1; i < size; i++){
            minPrice[i] = Math.min(prices[i], minPrice[i-1]);
            
            maxProfit[i] = Math.max(maxProfit[i-1], prices[i] - minPrice[i-1]);
        }
        return maxProfit[size - 1];
    }
}