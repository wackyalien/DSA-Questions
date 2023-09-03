import java.util.* ;
import java.io.*; 

public class Solution {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        
        int low = 1;
        int high = stalls[stalls.length-1]-stalls[0];

        while(low<=high){
            int mid = low + (high-low)/2;

            int maxmindistance = mid;

            Boolean possibletoplace = checkpossibility(stalls,maxmindistance,k);
            // System.out.println("low "+low+" high "+high+" maxmindistance "+maxmindistance+" possibletoplace "+possibletoplace);

            if(possibletoplace)
                low = mid+1;
            else
                high = mid - 1;
            // System.out.println("@@low "+low+" high "+high+" maxmindistance "+maxmindistance+" possibletoplace "+possibletoplace);

        }
        return high;
    }

    public static Boolean checkpossibility(int[] stalls, int mindistance,int k) {

        int lastcowposition = 0, cowplaced = 1;

        for(int i = 1;i<stalls.length;i++){

            if(stalls[i]-stalls[lastcowposition]>=mindistance){
                lastcowposition = i;
                cowplaced++;
            }
            if(cowplaced>=k)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {

        int[] stalls = {0,3,4,7,10,9};

        System.out.println(aggressiveCows(stalls,3));


    }
}