/*
    88. Merge Sorted Array

    fill the longer array from the end instead of start
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1, index3 = m + n - 1;
        
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[index3--] = nums1[index1--];
            } else {
                nums1[index3--] = nums2[index2--];
            }
        }
        
        while (index2 >= 0) {
            nums1[index3--] = nums2[index2--];
        }
        
    }
}