//Time complexity=O(n)
//Space complexity=)O(1)

import java.util.*;
public class Reverse_Array{
    public static void reverseArray(int arr[]){
        int n=arr.length;
        for(int i=0; i<n/2; i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
    public static void main(String args[]){
        int arr[]={1,6,8,5,9,8,7};
        reverseArray(arr);
        System.out.print("Reverse array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(+arr[i]+" ");
        }
    }
}