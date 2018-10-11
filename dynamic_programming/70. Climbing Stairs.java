/*
    70. Climbing Stairs
    one can reach i-th steps in one of the following ways:
    1). take a single step from (i-1)-th step
    2). take 2 step from (i-2)-th step

    dp[i] = dp[i-1] + dp[i-2]
*/

class Solution {
    public int climbStairs(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
}