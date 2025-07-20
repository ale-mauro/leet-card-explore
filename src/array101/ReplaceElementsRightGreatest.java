package array101;

public class ReplaceElementsRightGreatest {
    /*
    Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

    After doing so, return the array.

    

    Example 1:

    Input: arr = [17,18,5,4,6,1]
    Output: [18,6,6,6,1,-1]
    Explanation: 
    - index 0 --> the greatest element to the right of index 0 is index 1 (18).
    - index 1 --> the greatest element to the right of index 1 is index 4 (6).
    - index 2 --> the greatest element to the right of index 2 is index 4 (6).
    - index 3 --> the greatest element to the right of index 3 is index 4 (6).
    - index 4 --> the greatest element to the right of index 4 is index 5 (1).
    - index 5 --> there are no elements to the right of index 5, so we put -1.


    */ 

    public int[] replaceElements(int[] arr) {
        int max_so_far = arr[arr.length-1];
        arr[arr.length-1]=-1;
        
        for (int i=arr.length-2; i>=0; i--){  
            int replaced_element = arr[i];
            arr[i] = max_so_far;
            
            if (replaced_element >= max_so_far){
                max_so_far = replaced_element;
            }
            
        }
        
        return arr;

        //Time complexity O(n)
        //Space complexity O(1)
    }
    
    

    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{0,3,2,1};
        int[] result = new ReplaceElementsRightGreatest().replaceElements(nums1);
        System.out.println("Result: "+ java.util.Arrays.toString(result));
    }
}
