/*
    5. Longest Palindromic Substring
    use i, j where i<=j to check if the s.substring(i,j+1) is palindromic,
    first, check if s.charAt(i) == s.charAt(j), then check if s.substring(i+1)(j-1) is palindromic
    pay attention when i+1 > j-1 where s.substring(i+1)(j-1) doesn't exist
    or then i+1 = j-1, where s.substring(i+1)(j-1) is a character and palindromic itself
*/

class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return s;
        int n = s.length();
        int maxLength = 0;
        String res = "";
        boolean[][] dp = new boolean[n][n];
        
        for(int j = 0; j < n; j++){
            for(int i = 0; i <= j; i++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j-i <=2 || dp[i+1][j-1]);
                if(dp[i][j] && j-i+1 > maxLength){
                    res = s.substring(i,j+1);
                    maxLength = j-i+1;
                }
            }
        }
        return res;
        
    }
}