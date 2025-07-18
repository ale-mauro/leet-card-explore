package array101;

public class EvenNumberOfDigits {
    /*
    Given an array nums of integers, return how many of them contain an even number of digits.
    
    Example:
    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation: 
    12 contains 2 digits (even number of digits). 
    345 contains 3 digits (odd number of digits). 
    2 contains 1 digit (odd number of digits). 
    6 contains 1 digit (odd number of digits). 
    7896 contains 4 digits (even number of digits). 
    Therefore only 12 and 7896 contain an even number of digits.
    */ 

    public int findNumbers(int[] nums) {
        int num_with_even_digits = 0;
        
        for (int num : nums){
            int count = 0;
            do{
                count++;
                num/=10;
            }while(num!=0);
            
            if (count%2 == 0)
                num_with_even_digits++;
        }
        
        return num_with_even_digits;
        // Time complexity O(n*k) [where k is the maximum number of digit, can be considered constant, so O(n)]
        // Space complexity O(1)
        }
    
    

    public static void main(String[] args) throws Exception {
        int[] test_array = {12, 345, 2, 6, 7896};
        int result = new EvenNumberOfDigits().findNumbers(test_array);

        System.out.println("Result: " + result);
    }
}
