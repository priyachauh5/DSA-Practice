//Time complexity: O(n)
//Space complexity: O(n)

import java.util.*;
import java.util.HashSet;
public class Contains_Duplicates{
    public static boolean containsDuplicates(int arr[]){
        HashSet<Integer> seen=new HashSet<>();
        for(int num: arr){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1};
        System.out.print(containsDuplicates(arr));
    }
}