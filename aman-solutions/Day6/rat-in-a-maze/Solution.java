import java.util.*;
public class Solution {
    public static List<String> allTravelledpath = new ArrayList<String>();
    
    public static void traverse(int[][] mat, int i, int j, String travelledpath) {

        if(i == (mat.length - 1) && j == (mat[i].length-1)){
            allTravelledpath.add(travelledpath);
            return;
        }

        if( j < (mat[i].length - 1) && mat[i][j+1] == 1) {
            mat[i][j+1] = 2;
            String oldpath = travelledpath;
            travelledpath+="R";
            traverse(mat, i, j+1, travelledpath);
            mat[i][j+1] = 1;
            travelledpath = oldpath;
        }

        if( i > 0 && mat[i-1][j] == 1) {
            mat[i-1][j] = 2;
            String oldpath = travelledpath;
            travelledpath+="U";
            traverse(mat, i-1, j, travelledpath);
            mat[i-1][j] = 1;
            travelledpath = oldpath;
        }

        if( j > 0 && mat[i][j-1] == 1) {
            mat[i][j-1] = 2;
            String oldpath = travelledpath;
            travelledpath+="L";
            traverse(mat, i, j-1, travelledpath);
            mat[i][j-1] = 1;
            travelledpath = oldpath;
        }

        if(i < (mat.length - 1) && mat[i+1][j] == 1) {
            mat[i+1][j] = 2;
            String oldpath = travelledpath;
            travelledpath+="D";
            traverse(mat, i+1, j, travelledpath);
            mat[i+1][j] = 1;
            travelledpath = oldpath;
        }
        return;
    }


    public static List<String> ratMaze(int [][]mat) {
        // Write your code here.
        mat[0][0]=0;
        traverse(mat, 0, 0, "");
        return allTravelledpath;

    }


    public static void main(String[] args) {

        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(ratMaze(mat));

    }
}