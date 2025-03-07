import java.util.*;
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters{
    public static int longestSubstring(String s){
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0; right<s.length(); right++){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String args[]){
        String s="abcabcbbbbb";
        System.out.print(longestSubstring(s));
    }
}