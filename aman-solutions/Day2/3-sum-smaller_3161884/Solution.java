import java.io.*;
import java.util.* ;

public class Solution {
	public static int threeSumSmaller(int n, int[] arr, int target) {
		// Write your code here.

        Arrays.sort(arr);


        int ans = 0;


        for(int i=0;i<n-2;i++) {
            int j = i + 1, k = n - 1;

            while(j<k){

                if(arr[i]+arr[j]+arr[k]>=target){
                    k--;
                }
                else{
                    ans+=(k-j);
                    System.out.println("i"+i+" k "+k+" j "+j+" ans "+ans);
                    j++;
                }

            }

        }
        return ans;
        
	}

    public static void main(String args[]) {
        int[] arr={1,5,2,3,4,6,7};
        System.out.print(threeSumSmaller(7,arr,9));
    }
    
}
