import java.util.* ;
import java.io.*; 

public class Solution {
    

    public static String isPairDifferenceK(int[] arr, int n, int k) {
        // Write your code here.
        for(int i=0;i<arr.length;i++) {
            int numbertofind = (k+arr[i]);

            int low = i+1;
            int high = arr.length-1;

            int control =0,position=-1;
            int mid=-1;
            // System.out.println("checking ls "+low+" "+high );
            while(low<=high) {
                mid = low + (high-low)/2;
                // System.out.println("checking "+ " low " + low +" high "+high+ " mid "+ arr[mid] + " "+ numbertofind);
                if(arr[mid]==numbertofind)
                {
                    position = mid;
                    break;
                }
                // System.out.println("condition "+(numbertofind>arr[mid])+" low "+low+" high "+high);
                if(numbertofind>arr[mid])
                    low = mid+1;
                else
                    high = mid-1;
                // System.out.println("checking >"+ " low " + low +" high "+high+ " mid "+ arr[mid] + " "+ numbertofind);
                
                if(control++>10){
                    System.out.print("forced");
                    break;
                }

            }
            if(position != -1)
            {
                return "Yes";
            }
            
        }
        return "No";
    }

    public static void main(String args[]){
        int[] arr = {1,2,3};

        System.out.println(isPairDifferenceK(arr,3,2));
    }

}