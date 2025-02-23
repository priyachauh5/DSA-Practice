import java.util.*;
public class sample{
    public static void nQueen(char board[][], int row[]){
        if(row==board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueen(board, row+1);
                board[row][j]='X';
            }
        }
    }
    public static void printArr(char board[][]){
        System.out.println("---chess board-----");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
               System.out.print(board[i][j]+" "); 
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i++){
            if(board[i][col]=='Q'){
                retyrn false;
            }
        }
        
        for(int i=row-1; i>=0; i++){
            if(board[i][col]=='Q'){
                retyrn false;
            }
        }
    }

    public static void main(String args[]){
        int n=2;
        char board=new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='X';
            }
        }
        nQueens(board, 0);
    }
}