/*
    303. Range Sum Query - Immutable
    1). make an array to store the first i-th sum
    2). if i == 0, return j-th sum; else, return j-th sum - i-th sum
*/

class NumArray {
    private int[] sums;
    
    public NumArray(int[] nums) {
        if(nums.length == 0){
            return;
        }
        sums = new int[nums.length];
        sums[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            sums[i] = sums[i-1] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        if(i == 0){
            return sums[j];
        } else {
            return sums[j] - sums[i-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */