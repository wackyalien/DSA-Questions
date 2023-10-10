import java.util.*;
import java.io.*; 


public class Solution {
    public static boolean foundanswer=false;
    public static void dfs(int col, int[][] board, ArrayList<ArrayList<Integer>> answer, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {

        if(col == board.length)
        {
            // answer.add(Arrays.asArrayList(board));
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i = 0;i<board.length;i++){
                for(int j = 0;j<board[i].length;j++){
                    arr.add(board[i][j]);
                }
            }
            answer.add(arr);
            return;
        }

        for(int row = 0; row < board.length; row++){
            if(leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) {
                board[row][col] = 1;
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;

                dfs(col+1, board, answer, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = 0;

                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }

    }


    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        int[][] board = new int[n][n];
        for(int i = 0;i<n;i++)
            for(int j = 0;j<n;j++)
                board[i][j]=0;
        ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];
        dfs(0,board,answer, leftRow, lowerDiagonal, upperDiagonal);
        return answer;
    }


    public static void main(String args[]) {
        // solveNQueens(4);
        System.out.println(solveNQueens(4));
    }
}