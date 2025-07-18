package array101;

public class MaxConsecutiveOnes {
    /*
    Given a binary array nums, return the maximum number of consecutive 1's in the array.
    Input: nums = [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
     */ 
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_consec_ones = 0;
        int current_consec_ones = 0;
        
        for (int value: nums){
            if (value == 1){
                current_consec_ones++;
                if (current_consec_ones > max_consec_ones)
                    max_consec_ones = current_consec_ones;
            }
            else{
                current_consec_ones = 0;
            }
        }
        return max_consec_ones;
            
        // Time complexity O(n)
        // Space complexity O(1)
    }


    public static void main(String[] args) throws Exception {
        int[] test_array = {1, 1, 0, 1, 1, 1};
        int result = new MaxConsecutiveOnes().findMaxConsecutiveOnes(test_array);

        System.out.println("Max consecutive ones: " + result);
    }
}
