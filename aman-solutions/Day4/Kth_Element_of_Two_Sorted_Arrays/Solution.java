import java.util.*;


public class Solution {

    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        // Write your code here.

        int row1counter = 0;
        int row2counter = 0;
        
        Boolean traverse = true;
        if(m<1)
            return row2[k-1];
        else if(n<1)
            return row1[k-1];
        while(traverse) {
            if(k<2) {
                System.out.println("row1counter "+row1counter+"  row2counter "+row2counter);
                if( (row1counter<m && row2counter<n && row1[row1counter]<row2[row2counter])||(row2counter>=n)){
                    return row1[row1counter];
                }
                return row2[row2counter];

                // return (row1[row1counter]<row2[row2counter]?row1[row1counter]:row2[row2counter]);
            }
            if(((row1counter<m && row2counter<n && row1[row1counter]<=row2[row2counter])||(row2counter>=n))){
                row1counter++;
            }
            else {
                row2counter++;
            }
            k--;

        }


        return 0;
    }


    public static void main(String args[]){
        // int[] row1 = {2,2,3,4,5,7,8,8,9,9};
        // int[] row2 = {1,2,2,2,3,3,5,5,5,5};
        int[] row1 = {3,11,23,45,52};
        int[] row2 = {};

        System.out.print(ninjaAndLadoos(row1,row2,row1.length,row2.length,3));
    }

}