/*
    448. Find All Numbers Disappeared in an Array
    Mark the value of already apeared index to negative, then loop it through to find the positive ones , then the index of positive ones is the result;
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) result.add(i+1);
        }
        
        return result;
    }
}