import java.util.Stack;
// import java.util.StringBuilder;

public class AddString{
    public static String AddString(String num1, String num2){
        Stack<Integer> stack=new Stack<>();
        StringBuilder str=new StringBuilder();

        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;

        while(i>=0 || j>=0 || carry!=0){
            int digit1=(i>=0)?num1.charAt(i)-'0':0;
            int digit2=(j>=0)?num2.charAt(j)-'0':0;

            int sum=digit1+digit2+carry;
            carry=sum/10;
            stack.push(sum%10);

            i--;
            j--;
        }

        while(!stack.isEmpty()){
            str.append(stack.pop());
        }

        return str.toString();
    }
    public static void main(String args[]){
        String num1="11";
        String num2="123";
        System.out.println(AddString(num1, num2));
    }
}