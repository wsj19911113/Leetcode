/*
    62. Unique Paths
    subproblem: dp[i][j] is the # of unique path to the [i,j]
    recursion: dp[i][j] = dp[i-1][j] + dp[i][j-1]
*/


//below is the solution by 2-D array
//time O(m*n), space O(m*n)

class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 && n == 0){
            return 0;
        }
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i < m+1; i++){
            dp[i][0] = 1;
        }
        for(int j = 0; j < n+1; j++){
            dp[0][j] = 1;
        }
        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

/*这种优化是对上述方法空间的一种优化，使得空间复杂度从原来的 O(n*m)下降为 O(n)。
对于起点到点(i,j)的路径总数：ways[j]= 起点到点(i-1, j) 的路径总数：ways[j] + 起点到点(i, j-1)的路径总数 ways[j-1]，
于是我们就得到递推式：ways[j] = ways[j] + ways[j-1]
--------------------- 
作者：Code_Granker 
来源：CSDN 
原文：https://blog.csdn.net/happyaaaaaaaaaaa/article/details/50856112?utm_source=copy 
版权声明：本文为博主原创文章，转载请附上博文链接！
*/

class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 && n == 0){
            return 0;
        }
        int dp[] = new int[m];
        dp[0] = 1;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < m; j++){
                dp[j] += dp[j-1];
            }
        }
        
        return dp[m-1];
    }
}