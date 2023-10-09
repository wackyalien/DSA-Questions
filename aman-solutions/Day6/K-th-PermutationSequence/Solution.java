import java.io.*;
import java.util.*;

public class Solution {
    
    public static int factorial(int number) {
        int factorial = 1;

        for(int i = number;i>1;i--) {
            factorial=factorial*i;
        }

        return factorial;

    }

    public static String findnextcombination(String numstring, int n, int k,int initalcombination,int iterator) {
        
        for(int i = 1; i<=n;i++){
            if(numstring.indexOf(Integer.toString(i))==-1){
                String tempstring = numstring+Integer.toString(i);
                int lengthofstr = tempstring.length();
                int combinationpossible = factorial(n-lengthofstr);
                initalcombination+=combinationpossible;
                // System.out.println(tempstring+"  "+lengthofstr+"  "+combinationpossible+"  "+initalcombination);
                if(k<=initalcombination){
                    numstring=tempstring;
                    initalcombination-=combinationpossible;
                    break;
                }
            }
        }
        // if(iterator>5)
        //     return numstring;
        if(numstring.length()<n)
            return findnextcombination(numstring,n,k,initalcombination,++iterator);
        return numstring;

    }

    public static String kthPermutation(int n, int k) {
        // Write your code here.
        String answer = findnextcombination("",n,k,0,1);
        return answer;
    }

    public static void main(String args[]) {
        System.out.print(kthPermutation(1,1));
    }
}


