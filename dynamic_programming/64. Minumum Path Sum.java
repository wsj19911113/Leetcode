/*
	64. Minumum Path Sum
	subproblem: dp[i][j] is the min sum from dp[0][0] -> dp[i][j]
	recursion: dp[i][j] = min{dp[i-1][j], dp[i][j-1]} + num[i][j]
*/

class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid[0].length;
        
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int[] line : grid){
        	dp[0] += line[0];
            for(int i = 1; i<n; i++){
                dp[i] = Math.min(dp[i], dp[i-1]) + line[i];
            }
        }
        return dp[n-1];
    }
}