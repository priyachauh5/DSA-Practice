import java.util.*;
import java.util.Arrays;
import java.util.HashSet;

public class Sum{
    public static void Sum(int nums[]){
        int n=nums.length;
        HashSet<List<Integer>>s=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
                while(j<k && nums[j]==nums[j-1]){
                    j++;
                }
                // while(j<k && nums[k]==nums[k+1]){
                //     k--;
                // }
            }
        }

        for(List<Integer> triplet:s){
            System.out.print(triplet);
        }
    }
    public static void main(String args[]){
        int nums[]={-1, 0, 1, 2};
        Sum(nums);
    }
}