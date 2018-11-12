/*
    268. Missing Number
*/

// Gauss's sum law
class Solution {
    public int missingNumber(int[] nums) {
        int sum = (0+nums.length)*(nums.length + 1)/2;
        for(int i = 0; i < nums.length; i++){
            sum -= nums[i];
        }
        return sum;
    }
}

/* 
    0 ^ 0 = 0
    b ^ b = 0
    0 ^ a = a
    a ^ b ^ b = a
*/

class Solution {
    public int missingNumber(int[] nums) {
		int n = nums.length;
		int x = 0;
		for(int i = 1; i<= n ;i++) {
			x = x ^ i ^ nums[i-1];
		}
		return x;
	}
}