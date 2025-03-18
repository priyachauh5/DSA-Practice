import java.util.HashSet;

public class ContainsDuplicate{
    public static boolean containsDuplicate(int nums[], int k){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i>nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,1,2,3};
        int k=3;
        System.out.print(containsDuplicate(nums, k));
    }
}