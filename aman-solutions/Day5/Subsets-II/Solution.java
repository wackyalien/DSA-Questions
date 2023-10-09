import java.io.*;
import java.util.*;

public class Solution {
        public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        solution(0, new ArrayList<>(), arr, arrList);
        
        return arrList;
    }

    public static void solution(int index, ArrayList<Integer> list, int num[], ArrayList<ArrayList<Integer>> solList) {

        solList.add(new ArrayList<>(list));
        
        for(int i=index; i<num.length; i++) {

            if(i!=index && num[i]==num[i-1]){
                continue;
            }
            list.add(num[i]);
            solution(i + 1, list, num, solList);
            list.remove(list.size()-1);
        }
    }

    public static void main(String args[]) {
        int[] numbers = {1,1,3};
        // uniqueSubsets(2,numbers);
        System.out.print(uniqueSubsets(2,numbers));
    }

}