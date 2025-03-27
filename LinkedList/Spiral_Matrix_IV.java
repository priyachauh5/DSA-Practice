import java.util.*;

public class Node{
    int data;
    Node next;
    public static Node(data){
        this.data=data;
        this.next=null;
    }
}

public static Node head;
public static Node tail;

public class Spiral_Matrix_IV{
    public int[][] spiralMatrix(int m, int n, ListNode head){
        int matrix[][]=new int[m][n];
        int top=0, bottom=m-1, left=0, right=n-1;
        ListNode curr=head;

        //for any unfilled spots
        for(int i=0; i<m; i++){
            Arrays.fill(matrix[i],-1);
        }

        //Fill the matrix in a spiral order
        while(curr!=null && top<=bottom && left<=right){
            for(int i=left; i<right; i++){
                matrix[top][n]=curr.data;
                curr.data=curr.next;
            }
            top++;
        }
    }
    public static void main(String args[]){

    }
}
