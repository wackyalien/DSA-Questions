import java.io.*;
import java.util.* ;

public class Solution {
    public static int findMedian(int matrix[][], int m, int n) {
        // Write your code here
        
        int[] arr = new int[m*n];
        int index =0;
        int max = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]>max)
                    max = matrix[i][j];
                arr[index++]=matrix[i][j];
            }
        }
        int median = (int) arr.length/2;
        long[] _arr = new long[max+1];

        for(int i = 0;i<arr.length;i++){
            _arr[arr[i]]++;
        }
        int counter = 0;
        for(int i =0;i<_arr.length;i++){
            counter+=_arr[i];
            if(counter>median)
                return i;
            // System.out.println("iii> "+i+" "+_arr[i]+" "+counter);
        }
        


        return arr[(int) arr.length/2];
    }

    public static void main(String args[]) {
        
        int[][] matrix = {
            {1, 5, 7, 9, 11},
            {2,3,4,8,9},
            {4,11,14,19,20},
            {6,10,22,99,100},
            {7,15,17,24,28}
        };
        System.out.print(findMedian(matrix,5,5));
    }
    
}
