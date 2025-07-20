package array101;

public class ValidMountainArray {
    /*
    Given an array of integers arr, return true if and only if it is a valid mountain array.

    Recall that arr is a mountain array if and only if:

        arr.length >= 3
        There exists some i with 0 < i < arr.length - 1 such that:
            arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
            arr[i] > arr[i + 1] > ... > arr[arr.length - 1]


    Example 1:

    Input: arr = [2,1]
    Output: false

    Example 2:

    Input: arr = [3,5,5]
    Output: false

    Example 3:

    Input: arr = [0,3,2,1]
    Output: true

    */ 

    public boolean validMountainArray(int[] arr) {
        boolean in_increasing_phase = true;
        boolean in_decreasing_phase = false;
        int num_of_changes = 0;
        
        if (arr.length < 3)
            return false;
        
        if (arr[1] <= arr[0])
            return false;
        
        for (int i=1; i<arr.length; i++){
            if (arr[i] == arr[i-1])
                return false;
            
            if (in_increasing_phase){
                if (arr[i] <= arr[i-1]){
                    in_increasing_phase = false;
                    in_decreasing_phase = true;
                    num_of_changes++;
                }
            }
            else if (in_decreasing_phase){
                if (arr[i] >= arr[i-1]){
                    in_increasing_phase = false;
                    in_decreasing_phase = true;
                    num_of_changes++;
                }
            }
            
        }
        return num_of_changes == 1;
        
    }
    
    

    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{0,3,2,1};
        boolean result = new ValidMountainArray().validMountainArray(nums1);
        System.out.println("Result: "+ result);
    }
}
