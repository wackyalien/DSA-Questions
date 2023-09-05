import java.util.* ;
import java.io.*; 
public class Solution {
    public static long ayushGivesNinjatest(int nodays, int m, int[] time) {
        // Write your code here.

        int high=0,max=time[0];
        for(int i = 0;i<time.length;i++){
            high+=time[i];
            if(max<time[i])
                max=time[i];
        }
        int low = max;

        int answer=0;
        while(low<=high){
            int mid = low + (high-low)/2;

            int nodaysrequired = calculatedays(time,mid);
            // System.out.println(" mid "+mid+" nodaysrequired "+nodaysrequired + " low " + low + " high "+high+ " answer "+answer);

            if(nodaysrequired==nodays)
                answer=mid;

            if(nodaysrequired<=nodays)
                high=mid-1;
            else
                low = mid+1;
        }


        
        return low;
    }

    public static int calculatedays(int[] time,int maxstudyfordayallowed ){

        int days = 1,maxstudiedinday=0;
        for(int i = 0;i<time.length;i++){
            if(maxstudiedinday+time[i]<=maxstudyfordayallowed){
                maxstudiedinday+=time[i];
            }
            else{
                days++;
                maxstudiedinday=time[i];
            }
        }
        return days;
    }
    


    public static void main(String args[]) {

        int[] time = {1,2,2,3,1};

        System.out.println(ayushGivesNinjatest(3,time.length,time));


    }
}