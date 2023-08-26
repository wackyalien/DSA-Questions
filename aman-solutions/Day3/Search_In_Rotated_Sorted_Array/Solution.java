import java.io.*;
import java.util.* ;

public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here
        int low = 0,high=arr.length-1,counter=0;

        while(low<high) {
            int mid = low + (high-low)/2;

            if(arr[mid] == key)
                return mid+1;
            System.out.println("mid "+mid);
            if(arr[low] <= arr[mid]) {
                if(key<arr[mid] && key>arr[low])
                    return findinlist(arr,low,mid,key);
                else
                    return findinlist(arr,mid,high,key);
            }
            
            if(arr[mid]>arr[low])
                low = mid+1;
            else    
                high = mid-1;

        }
        return -1;

    }

    public static int findinlist(int arr[],int start,int end, int key) {
        int index=-1;
        System.out.println("findinlist "+start+" "+end);
        for(int i=start;i<=end;i++){
            if(arr[i]==key)
                return i+1;
        }
        return index;
    }

    public static void main(String args[]) {
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.print(search(arr,2));
    }
    
}
