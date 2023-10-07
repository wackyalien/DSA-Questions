import java.io.*;
import java.util.*;

public class Solution {
    public static ArrayList<ArrayList<Integer>> gsubsetsums = new ArrayList<ArrayList<Integer>>();
    public static Map<ArrayList<Integer>,Integer> subsetmap = new HashMap<ArrayList<Integer>,Integer>();
    
    public static int calculatesum( int start, int arr[], ArrayList subset,int lastinserted) {
        if(start>=arr.length-1){
            if(!subsetmap.containsKey(subset)) {
                gsubsetsums.add(subset);
                subsetmap.put(subset,1);
            }
            return 0;
        }
        ArrayList<Integer> subset1 = new ArrayList<Integer>(subset);
        calculatesum(start+1, arr, subset1,lastinserted);
        ArrayList<Integer> subset2 = new ArrayList<Integer>(subset);
        subset2.add(arr[start+1]);
        calculatesum(start+1, arr, subset2, lastinserted+1);
        return 0;
    }

    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        ArrayList<Integer> subsetsums = new ArrayList<Integer>();
        calculatesum(-1,arr,subsetsums,0);
        // System.out.print(subsetmap);
        return gsubsetsums;
    }

    public static void main(String args[]) {
        int[] numbers = {1,1,3};
        // uniqueSubsets(2,numbers);
        System.out.print(uniqueSubsets(2,numbers));
    }

}