import java.util.*;

public class Solution {
	public static int[] maxSlidingWindow(int[] arr, int n, int k) {
        // Write your code here.
        int[] answer = new int[n-k+1];
        int max=arr[0];
        int prevmax = Integer. MIN_VALUE;
        for(int i = 0; i < n-k+1; i++) {

            if(i == 0||prevmax==Integer. MIN_VALUE) {
                max=arr[i];
                for(int j=i;j<i+k;j++) {
                    System.out.print(arr[j]+" ");
                    if(max<arr[j])
                        max=arr[j];
                }
            }
            else {
                System.out.print(i+" "+k+" elem "+arr[i+k-1]);
                
                if(prevmax<arr[i+k-1])
                    max=arr[i+k-1];
            }
            if(max!=arr[i])
                prevmax = max;
            else 
                prevmax = Integer. MIN_VALUE;
            System.out.println("max "+max + " prevmax "+prevmax);


            answer[i]=max;
        }

        return answer;
	}

    public static void main(String args[]) {
        int[] arr = {7,6,5,4,3,2,1};
        int k = 3;
        int[] answer = maxSlidingWindow(arr,arr.length,k);
        for(int i = 0; i< answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}