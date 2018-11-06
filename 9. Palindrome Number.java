/*
    9. Palindrome Number
    when the number is like 10, 100, 1000.... return false directly
    in case of overflow, accumulate a reversed number and stop at the center
    upon return, there might be two cases: eg. 1221 or 121
*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x%10 == 0)) return false;
        
        int rev = 0;
        while(x > rev){
            int rem = x %10;
            x = x/10;
            rev = rev*10+rem;
        }
        
        return rev == x || rev/10 == x;
    }
}