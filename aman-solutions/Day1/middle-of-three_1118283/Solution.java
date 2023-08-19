import java.util.* ;
import java.io.*; 
public class Solution {
	public static int middleOfThree(int x, int y, int z) {
		// Write your code here.
		int[] arr = new int[3];
		arr[0]=x;
		arr[1]=y;
		arr[2]=z;

		int minimum = arr[0];
		int maximum = arr[0];

		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minimum)
				minimum = arr[i];
			if(arr[i]>maximum)
				maximum = arr[i];
		}
        // System.out.println(minimum + "" + maximum);
		int leftout=arr[0];
		for(int i=0;i<arr.length;i++) {
			leftout = arr[i];
			if(leftout == minimum)
				continue;
			else if(leftout == maximum)
				continue;
			else{
				break;
			}
		}
		return leftout;

	}

    public static void main(String args[]){
        System.out.print(middleOfThree(2,3,1));
    }
}