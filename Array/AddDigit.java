public class AddDigit{
    public static int AddDigit(int num){
        while(num>=10){
             int sum=0;
            while(num>0){
                int rem=num%10;
                sum+=rem;
                num=num/10;
            }
            
            num=sum;
        }
        return num;
    }
    public static void main(String args[]){
        int  num=38;
        System.out.print(AddDigit(num));
    }
}