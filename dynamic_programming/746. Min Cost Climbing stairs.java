/*
    746. Min Cost Climbing stairs
    subproblem: dp[i] is the lowest cost at i-th step
    recursion: dp[i] = min{dp[i-1]+cost[i], dp[i-2]+cost[i]}
*/


class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        //if(size <= 0){
        //    return 0;
        //}
        int[] dp = new int[size];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i<size; i++){
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }
        return Math.min(dp[size-1], dp[size-2]);
    }
}