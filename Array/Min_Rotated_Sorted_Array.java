import java.util.*;

public class Min_Rotated_Sorted_Array{
    public static void main(String args[]){
        int arr[]={5,7,8,12,15,20,-7,-4,0,2};
        int si=0;
        int ei=arr.length-1;
        
        while(si<ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]>arr[ei]){
                si=mid+1;
            }else{
                ei=mid;
            }
        }

        System.out.println(arr[si]); //when both si==ei
    }
    
}