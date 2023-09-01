import java.util.*;


public class Solution {

    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        // Write your code here.

            if(m>n)
                return ninjaAndLadoos(row2,row1,n,m,k);
            
            if(m==0)
                return row2[k-1];
            
            if(k==1)
                return Math.min(row1[0],row2[0]);

            int i = Math.min(m,k/2);
            int j = Math.min(n,k/2);

            if(row1[i-1]>row2[j-1]) {
                int newRow2[] = Arrays.copyOfRange(row2, j, n);
                return ninjaAndLadoos(row1,newRow2,m,n-j,k-j);
            }
            int newRow1[] = Arrays.copyOfRange(row1,i,m);
            return ninjaAndLadoos(newRow1,row2,m-i,n,k-i);

    }




    public static void main(String args[]){
        int[] row1 = {2,2,3,4,5,7,8,8,9,9};
        int[] row2 = {1,2,2,2,3,3,5,5,5,5};
        // int[] row1 = {3,11,23,45,52};
        // int[] row2 = {};

        System.out.print(ninjaAndLadoos(row1,row2,row1.length,row2.length,3));
    }

}