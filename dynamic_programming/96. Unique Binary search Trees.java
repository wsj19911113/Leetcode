/*
    96. Unique Binary search Trees
    subprolem: dp[i] is the # of BST that store values 1 ... n;
    recursion: dp[i] = sum(dp[i-1]*dp[0] + dp[i-2]*dp[1] + ....... + dp[0] * dp[i-1])
*/

class Solution {
    public int numTrees(int n) {
        if(n == 0){
            return 0;
        }
        
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[i-j-1]*dp[j];
            }
        }
        return dp[n];
    }
}