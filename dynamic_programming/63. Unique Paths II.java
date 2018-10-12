/*
	63. Unique Paths II
	since without obstacle, dp[i][j] = dp[i-1][j] + dp[i][j-1]
	if there is an obstacle, there will be no way to reach either dp[i-1][j] or dp[i][j-1]

	set dp[i][j] = 0 when obstacleFrid[i][j] == 1
*/

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        
        int[] dp = new int[m];
        dp[0] = 1;
        for(int[] line : obstacleGrid){
        	if(line[0] == 1) {
        		dp[0] = 0;
        	}
            for(int i = 1; i < m; i++){
                if(line[i] == 1){
                    dp[i] = 0;
                }else{
                    dp[i] += dp[i-1];
                }
            }
        }
        return dp[m-1];
    }
}