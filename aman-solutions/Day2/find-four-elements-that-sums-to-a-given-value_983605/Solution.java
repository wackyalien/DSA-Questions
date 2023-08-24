import java.io.*;
import java.util.* ;

public class Solution {

    // public static String checkrecursively(int[] arr,int consideredcount, int remainingsum,int sum,int index){

    //     // System.out.println("remainingsum "+remainingsum + " sum "+ sum +" index "+index + " consideredcount "+consideredcount);
    //     if(remainingsum == sum && consideredcount == 4){
    //         return "Yes";
    //     }
    //     else if(index>(arr.length-1) || consideredcount > 3)
    //         return "No";

    //     String answer1="No",answer2="No";
    //     if(consideredcount < 4)
    //         answer1 = checkrecursively(arr, consideredcount+1 , remainingsum, sum+arr[index], index+1);
    //     if(answer1=="No")
    //     answer2 = checkrecursively(arr,consideredcount, remainingsum, sum, index+1);
    //     return (answer1=="Yes" || answer2=="Yes" ?"Yes":"No");
    // }

    // public static String fourSum(int[] arr, int target, int n) {
    //   // Write your code here.
    //     return checkrecursively(arr, 0, target,0, 0);
    // }


    // public static String fourSum(int[] arr, int target, int n) {
    //     HashMap<Integer, String> map = new HashMap<>();

    //     for(int i = 0; i < arr.length; i++) {
    //         for(int j = i+1; j < arr.length; j++) {
    //             int totalsumup = arr[i]+arr[j];
    //             System.out.println("already visited "+map.containsKey(totalsumup)+ " totalsumup "+totalsumup);
    //             if (map.containsKey(totalsumup))
    //                 continue;
    //             String answer = checkrecursively(arr, 2, target,totalsumup, j+1);
    //             map.put(totalsumup,answer);
    //             if( answer == "Yes")
    //                 return "Yes";
    //         }
    //     }
    //     return "No";
    // }
    public static String foursum(int X, int[] arr, Map<Integer, pair> map){
        int[] temp = new int[arr.length];
        for(int i=0;i< temp.length;i++)
            temp[i]=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
    
                int curr_sum = arr[i] + arr[j];
    
                if (map.containsKey(X - curr_sum)) {
    
                    pair p = map.get(X - curr_sum);
    
                    if (p.first != i && p.sec != i
                        && p.first != j && p.sec != j
                        && temp[p.first] == 0
                        && temp[p.sec] == 0 && temp[i] == 0
                        && temp[j] == 0) {
    
                        temp[p.sec] = 1;
                        temp[i] = 1;
                        temp[j] = 1;
                        return "Yes";
                    }
                }
            }
            // System.out.println("No");
        }
        return "No";
    }


        public static Map<Integer, pair> twosum(int[] nums){
            Map<Integer,pair> map=new HashMap<>();
            for(int i = 0; i< nums.length -1; i++) {
                for(int j = i+1; j<nums.length;j++){
                    map.put(nums[i]+nums[j],new pair(i,j));
                }
            }

            return map;
        }

public static class pair{
    int first,sec;
    public pair(int first,int sec){
        this.first = first;
        this.sec = sec;
    }
}

    public static void main(String args[]){
        int[] arr = {81, 96, -51, 30, -85, -42, -79, -40, 90, 7, -57, 49, -29, -85, 12, 44, -55, -27, 29};
        Map<Integer, pair> map = twosum(arr);
        String answ = foursum(-60,arr,map);
        System.out.println(answ);
    }
}
