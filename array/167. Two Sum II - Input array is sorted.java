/*
    167. Two Sum II - Input array is sorted
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] result = {i+1,j+1};
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                result[0] = i+1;
                result[1] = j+1;
                return result;
            } else if(numbers[i] + numbers[j] > target){
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
}