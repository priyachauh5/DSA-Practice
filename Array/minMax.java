import java.util.*;
import java.util.Arrays;
public class minMax{
    public static class Pair{
        int min;
        int max;
    }
    public static Pair getMinMax(int arr[], int n){
        Pair minMax=new Pair();
        Arrays.sort(arr);
        minMax.min=arr[0];
        minMax.max=arr[n-1];
        return minMax;
    }
    public static void main(String args[]){
        int arr[]={1000, 11, 445, 1, 330, 3000};
        int arr_size=arr.length;
        Pair minMax=getMinMax(arr, arr_size);
        System.out.println("Minimum element is: "+ minMax.min);
        System.out.print("Maximum element is: "+ minMax.max);
    }
}