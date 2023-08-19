import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		int answer=-1;
		for(int i=1;i<N;i++) {
			int nextnumber = (i+1);
			if((i*i)==N || 
				((nextnumber)*(nextnumber)>N) 
				&& ((i*i)<=N)
			){
				answer=i;
				break;
			}
		}
		return answer;
	}
    public static void main(String args[]){
        int answer=sqrtN(6);
        System.out.print(answer);
    }
}
