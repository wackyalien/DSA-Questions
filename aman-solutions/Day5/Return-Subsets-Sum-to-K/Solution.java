import java.io.*;
import java.util.*;

public class Solution {

    public static ArrayList<ArrayList<Integer>> supersubset=new ArrayList<ArrayList<Integer>>();
    public static void calculatesum(int start,int sum,ArrayList<Integer> arr, int target,ArrayList subset) {
        
        if(start>=arr.size()-1){

            if(sum == target && subset.size()>0){
                supersubset.add(subset);
                return;
            }
            return;
        }


        ArrayList<Integer> subset1 = new ArrayList<Integer>(subset);
        calculatesum(start+1,sum, arr, target,subset1);
        
        ArrayList<Integer> subset2 = new ArrayList<Integer>(subset);
        subset2.add(arr.get(start+1));
        calculatesum(start+1,sum+arr.get(start+1), arr, target, subset2);
        return;
    }

    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        ArrayList<Integer> subset2 = new ArrayList<Integer>();
        Collections.sort(arr);
        calculatesum(-1, 0, arr, k,subset2);

        return supersubset;
    }
    public static void main(String args[]) {
        ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,1));
        System.out.print(findSubsetsThatSumToK(number,number.size(),5));
    }

}