package array101;

public class MergeSortedArray {
    /*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Example:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
*/ 

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;           // Pointer for nums1 (valid elements)
        int j = n - 1;           // Pointer for nums2
        int p = m + n - 1;        // Pointer for placement in nums1

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[p] = nums1[i];
                i--;
            } else {
                nums1[p] = nums2[j];
                j--;
            }
            p--;
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[p] = nums2[j];
            j--;
            p--;
        }

    }
    
    

    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[] {1,2,3,0,0,0}; 
        int m = 3; 
        int[] nums2 = new int[]{2,5,6}; 
        int n = 3;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        System.out.println("Result: "+ java.util.Arrays.toString(nums1));
    }
}
