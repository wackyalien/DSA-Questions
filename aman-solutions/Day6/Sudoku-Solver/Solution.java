public class Solution {
    public static boolean sudokuSolver(int board[][]){

        /* Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Don't print output and return output as specified in the question.
         */


        for(int i = 0;i<board.length;i++) {
            for(int j = 0;j<board[0].length;j++) {

                if(board[i][j] == 0) {

                    for(int number = 1; number < 10; number++) {

                        if(ispossible(board,i, j , number)){
                            board[i][j]=number;
                            if(sudokuSolver(board))
                                return true;
                            else
                                board[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean ispossible(int board[][], int row, int col, int number) {

        for(int i = 0; i < 9; i++){

            if(board[row][i]==number)
                return false;
            if(board[i][col]==number)
                return false;
            
            if(board[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==number)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int[][] board = {

            {0, 0, 4, 0, 5, 0, 0, 0, 0},
            {9, 0, 0, 7, 3, 4, 6, 0, 0},
            {0, 0, 3, 0, 2, 1, 0, 4, 9},

            {0, 3, 5, 0, 9, 0, 4, 8, 0},
            {0, 9, 0, 0, 0, 0, 0, 3, 0},
            {0, 7, 6, 0, 1, 0, 9, 2, 0},
            
            {3, 1, 0, 9, 7, 0, 2, 0, 0},
            {0, 0, 9, 1, 8, 2, 0, 0, 3},
            {0, 0, 0, 0, 6, 0, 1, 0, 0}

        };
        System.out.println(sudokuSolver(board));
    }
}
