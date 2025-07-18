package array101;

public class SquaresSortedArray {
    /*
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.    
    
    Example:
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].

    Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
    */ 

    public int[] sortedSquares(int[] nums) {
        int n  = nums.length;
        int [] result = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n-1;
        
        while (left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare > rightSquare){
                result[pos] = leftSquare;
                left++;
            }else{
                result[pos] = rightSquare;
                right--;
            }pos--;
        
        }
        return result;
        // Time complexity O(n)
        // Space complexity O(1)
        }
    
    

    public static void main(String[] args) throws Exception {
        int[] test_array = {12, 345, 2, 6, 7896};
        int result = new EvenNumberOfDigits().findNumbers(test_array);

        System.out.println("Result: " + result);
    }
}
