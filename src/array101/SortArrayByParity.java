package array101;

public class SortArrayByParity {
    /*

        Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

        Return any array that satisfies this condition.

        

        Example 1:

        Input: nums = [3,1,2,4]
        Output: [2,4,3,1]
        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


    */ 

    public int[] sortArrayByParity(int[] nums) {

        // The following solution require additional memory. To find a solution that does the operation in place!

        int[] return_array = new int[nums.length];
        int j=0;
        for (int num : nums){
            if (num % 2 == 0){
                return_array[j] = num;
                j++;
            }
        }
        
        for (int num : nums){
            if (num % 2 == 1){
                return_array[j] = num;
                j++;
            }
        }
        
        return return_array;

        // Time complexity O(n)
        // Space complexity O(n) 
    }
    
    

    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{0,3,2,1};
        int[] result = new SortArrayByParity().sortArrayByParity(nums1);
        System.out.println("Result: "+ java.util.Arrays.toString(result));
    }
}
