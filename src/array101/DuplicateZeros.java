package array101;

public class DuplicateZeros {
    /*
    Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

    Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
    
    Example:
    Input: arr = [1,0,2,3,0,4,5,0]
    Output: [1,0,0,2,3,0,0,4]
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    */ 

    public void duplicateZeros(int[] arr) {

        for (int i=0; i<arr.length; i++){
            if (arr[i] == 0){
                for (int k=arr.length-1; k>i; k--){
                    arr[k] = arr[k-1];
                }
                i++;
            }
        }
        // Time complexity O(n^2) [there could be a better solution with O(n) time complexity]
        // Space complexity O(1)
        }
    
    

    public static void main(String[] args) throws Exception {
        int[] test_array = {1,0,2,3,0,4,5,0};
        new DuplicateZeros().duplicateZeros(test_array);

        System.out.println("Result: "+ java.util.Arrays.toString(test_array));
    }
}
