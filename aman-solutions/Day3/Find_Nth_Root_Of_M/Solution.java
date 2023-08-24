import java.io.*;
import java.util.* ;

public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        // System.out.println(Math.pow(3,(3))==27);
        int ans = -1;

        int low = 1, high = m;

        while(low <= high){
            int mid = low + (high-low)/2;

            long x = 1;
            for(int i = 1;i<=n; i++) {
                x = x*mid;
            // System.out.println("x-> "+x);

                if(x>m)
                    break;
            }
            System.out.println(x+" "+mid);
            if(x == 1L * m)
            { 
                ans = mid;
                break;
            }

            if(x>m)
                high = mid -1;
            else 
                low = mid + 1;

            
        }
        return ans;


        
    }

    public static void main(String args[]) {
        System.out.print(NthRoot(9,1953125));
    }
    
}
