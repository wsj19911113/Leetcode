/*
	53. Maximun Subarray

	subProbem: DP[i] is the maximun subarray for a[0] -> a[i], including a[i]
	recursion: DP[I] = max{DP[i-1] + a[i], a[i] | 1 <= i < n}
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        if(size <= 1){
            return nums[0];
        }
        int maxValue = nums[0];
        int[] sum = new int[size];
        sum[0] = nums[0];
        
        for(int i = 1; i <size; i++){
            sum[i] = Math.max(sum[i-1] + nums[i], nums[i]);
            maxValue = Math.max(maxValue, sum[i]);
        }
        return maxValue;
    }
}