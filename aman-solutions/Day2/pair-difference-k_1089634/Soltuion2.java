import java.util.* ;
import java.io.*; 

public class Soltuion2 {
    

    public static String isPairDifferenceK(int[] arr, int n, int k) {
        // Write your code here.
    int i=0,j=1;
    while(i<n && j<n){

        if(i!=j && (arr[j]-arr[i])==k){
            return "Yes";
        }
        if(Math.abs(arr[i]-arr[j])>k){
            i++;
        }
        else 
            j++;


    }
        return "No";
    }

    public static void main(String args[]){
        int[] arr = {1,2,3};

        System.out.println(isPairDifferenceK(arr,3,2));
    }

}