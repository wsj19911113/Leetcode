/*
	199. House Robber
	for a given house i, we have two options:
	1). Take the money if didn't robbed house i-1
	2). Skip it

	value[i] = max{rob[i-2] + money[i], rob[i-1]}
*/

class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        if(size == 0){
            return 0;
        }
        int[] values = new int[size+1];
        values[0] = 0;
        values[1] = nums[0];
        for(int i = 2; i< size+1; i++){
            values[i] = Math.max(values[i-2] + nums[i-1], values[i-1]);
        }
        return values[size];
    }
}