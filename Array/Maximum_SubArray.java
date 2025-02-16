//Time complexity: O(n)
//Space complexity: O(1)

import java.util.*;
public class Maximum_SubArray{
    
    public static int maxSubArray(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0; i<arr.length; i++){
            currSum+=arr[i];
            maxSum=Math.max(currSum, maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.print("Maximum sum is: "+maxSubArray(arr));
    }
}