import java.io.*;
import java.util.* ;

public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here
        int low = 0,high = arr.length-1,mid;

        int pivot = findpivot(arr,0,arr.length-1);
        // System.out.println("pivot"+" "+pivot+" " +arr[pivot]);
        if(pivot == -1)
            return findinsubarray(arr,0,arr.length-1,key);
            
        if(arr[pivot]==key)
            return pivot;
        if(arr.length<2)
            return -1;

        if(arr[0]<=key)
            return findinsubarray(arr,0,pivot-1,key);
        return findinsubarray(arr,pivot+1,arr.length-1,key);
    }


    public static int findpivot(int arr[], int low, int high) {
        int pivot = -1;
        if(arr.length<2)
            return 0;

        while(low<high) {
            int mid = (low +high)/2;
            // System.out.println(" mid "+mid+" low "+low+" high "+high);

            // if((arr[mid] >= arr[low] && arr[mid] >= arr[high] && arr[mid]>arr[mid+1]))
                // return mid;
            
            if(low == high)
                return high;

            if(mid<high && arr[mid]>arr[mid+1])
                return mid;
            if(mid>low && arr[mid]<arr[mid-1])
                return (mid-1);

            if(arr[low] >= arr[mid])
                high=mid-1;
            else
                low=mid+1;

        }
        return -1;
    }

    public static int findinsubarray(int arr[], int low, int high, int key) {
        int position = -1;
        
        while(low<=high){
            int mid = low + (high - low)/2;
            // System.out.println("mid " +mid+" low "+low+" high "+high);
            if(arr[mid] == key)
                return mid;
            
            if(key>=arr[mid])
                low = mid + 1;
            else
                high = mid -1;


        }

        return position;
    }


    public static void main(String args[]) {
        // int[] arr = {4,5,6,7,8, 1, 2, 3 };
        int[] arr = {2, 3,4,5,6,7,8 };
        // int[] arr = {0};
        System.out.print(search(arr,13));
    }
    
}
