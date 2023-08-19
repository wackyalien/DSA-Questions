import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		int answer=-1;
		if(N == 1 || N == 0)
			return (int)N;
		
		int low = 0;
		int high = (int) N;
		int mid;

		while(low<high) {

			mid = low + ((high-low)/2);

			if(mid <= (N/mid))
				low = mid + 1 ;
			else
				high = mid;

		}
		return (int) low -1;
	}
    public static void main(String args[]){
        int answer=sqrtN(6);
        System.out.print(answer);
    }
}
