import java.io.*;
import java.util.*;

public class Solution {
    public static ArrayList<Integer> subsetsums = new ArrayList<Integer>();
    
    public static int calculatesum( int sum, int start, int arr[]) {
        if(start>=arr.length-1){
            subsetsums.add(sum);
            return sum;
        }

        int sum1 = calculatesum(sum, start+1, arr);
        int sum2 = calculatesum(sum+arr[start+1], start+1, arr);
        return 0;
    }

    public static ArrayList<Integer> subsetSum(int num[]) {
        calculatesum(0,-1,num);
        return subsetsums;

    }

    public static void main(String args[]) {
        int[] numbers = {1,2,3};
        System.out.print(subsetSum(numbers));
    }

}