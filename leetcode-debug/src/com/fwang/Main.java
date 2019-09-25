package com.fwang;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        int index1 = m - 1, index2 = n - 1, index3 = m + n - 1;

        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[index3--] = nums1[index1--];
            } else {
                nums1[index3--] = nums2[index2--];
            }
        }

        while (index1 > 0) {
            nums1[index3--] = nums1[index1--];
        }

        while (index2 > 0) {
            nums1[index3--] = nums2[index2--];
        }
    }
}
