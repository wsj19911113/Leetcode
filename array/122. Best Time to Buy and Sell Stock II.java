/*
    122. Best Time to Buy and Sell Stock II
    sum of all difference between two days' prices when prices[i+1] > prices[i]
*/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i+1] > prices[i]){
                maxProfit += prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }
}