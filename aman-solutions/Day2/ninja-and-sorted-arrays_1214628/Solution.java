import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int[] answer = new int[m+n];
        Boolean continueloop = true;
        int indexm=0,indexn=0,counter=0;

        while(continueloop) {
            if(indexn>(arr2.length-1)||(arr1[indexm]<=arr2[indexn] && arr1[indexm]!=0)){
                // System.out.println("arr1 "+answer[counter]);

                answer[counter] = arr1[indexm];
                indexm++;
            }
            else if((arr1[indexm]>=arr2[indexn] && arr2[indexn]!=0)||arr1[indexm]==0){
                // System.out.println("arr2 "+answer[counter]);

                answer[counter] = arr2[indexn];
                indexn++;
            }
            // System.out.println(answer[counter]);
            
            if(++counter>=(m+n))
                break;
        }
        for(int i=0;i<answer.length;i++) {
            // System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String args[]){
        int[] arr = {1, 10, 0, 0, 0};
        int[] arr2 = {3, 8, 11};

        ninjaAndSortedArrays(arr, arr2, 2,3);
    }
}
