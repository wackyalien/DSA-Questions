import java.io.*;
import java.util.* ;

public class Solution {
    public static double median(int[] a, int[] b) {
    	// Write your code here.
        int totallength = a.length+b.length;

        if(a.length>b.length)
            return median(b,a);
        
        int n = a.length;
        int m = b.length;

        int start=0;
        int end = a.length;

        int realmid = (n+m+1)/2;

        while(start<=end) {
            int mid  = (start+end)/2;
            int leftAsize = mid;
            int leftBsize = realmid - mid; 

            int leftA = (leftAsize>0)?a[leftAsize-1]:Integer.MIN_VALUE;
            int leftB = (leftBsize>0)?b[leftBsize-1]:Integer.MIN_VALUE;

            int rightA = (leftAsize<n)?a[leftAsize]:Integer.MAX_VALUE;
            int rightB = (leftAsize<m)?b[leftBsize]:Integer.MAX_VALUE;

            if(leftA<=rightB && leftB<=rightA) {
                if((m+n)%2==0)
                    return (Math.max(leftA,leftB)+Math.min(rightA,rightB))/2.0;
                return Math.max(leftA,leftB);
            }
            else if(leftA>rightB)
                end=mid-1;
            else
                start=mid+1;

        }
        return 0.0;
        
    }
    // 1 2 3 4 5 6


    public static void main(String args[]) {
        int[] arra = {2,4,6 };
        int[] arrb = {1,3,5 };
        // int[] arr = {0};
        System.out.print(median(arra,arrb));
    }
    
}
