import java.util.*;

public class Chocolate_Distribution_Problem{
    public static int chocolateProblem(int arr[], int m){
        int minDiff=Integer.MAX_VALUE;
        int currDiff=0;
        for(int i=0; i<arr.length-m; i++){
            currDiff=arr[i+m-1]-arr[i];
            minDiff=Math.min(currDiff, minDiff);
        }
        return minDiff;
    }
    public static void main(String args[]){
        int arr[]={2,3,4,7,9,12,56};
        int m=3;
        System.out.print("Minimum Diff is: "+chocolateProblem(arr,m));
    }
}