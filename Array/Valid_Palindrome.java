import java.util.*;
public class Valid_Palindrome{
    public static boolean palindrome(String s){
        StringBuilder sb=new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String newStr=sb.toString();
        String reverseStr=sb.reverse().toString();
        if(newStr.equals(reverseStr)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String s="A man, a plan, a canal: Panama";
        System.out.println(palindrome(s));
    }
}