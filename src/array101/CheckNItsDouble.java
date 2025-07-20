package array101;

public class CheckNItsDouble {
    /*
    Given an array arr of integers, check if there exist two indices i and j such that :

        i != j
        0 <= i, j < arr.length
        arr[i] == 2 * arr[j]


    Example:
    Input: arr = [10,2,5,3]
    Output: true
    Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
    */ 

    public boolean checkIfExist(int[] arr) {
        // Linear Solution requires HashMaps
        
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr.length; j++){
                if (i!=j && arr[i] == 2*arr[j])
                    return true;
            }
        }
        
        return false;
    }
    
    

    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{10,2,5,3};
        boolean result = new CheckNItsDouble().checkIfExist(nums1);
        System.out.println("Result: "+ result);
    }
}
