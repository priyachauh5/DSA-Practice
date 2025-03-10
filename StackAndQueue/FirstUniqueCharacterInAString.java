import java.util.*;
import java.util.HashMap;

public class FirstUniqueCharacterInAString{
    public static int unique(String str){
        HashMap<Character, Integer> s=new HashMap<>();

        for(int i=0; i<str.length(); i++){
            s.put(str.charAt(i), s.getOrDefault(str.charAt(i),0)+1);
        }

        for(int i=0; i<str.length(); i++){
            if(s.get(str.charAt(i))==1){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String args[]){
        String str="long";
        System.out.print(unique(str));
    }
}