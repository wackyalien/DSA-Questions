import java.util.* ;
import java.io.*; 
public class Solution {
    
    public static int findPos(int N, int K, int H, int[] A) {
        
        // Write your code here
        int position = -1;
        for(int i=0;i<A.length;i++){
            if(A[i]==H)
            {
                position = i;
                break;
            }
        }
        return position;
    }
}