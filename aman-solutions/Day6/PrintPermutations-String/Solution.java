import java.util.* ;
import java.io.*; 
public class Solution {
    public static String swap(String str,int index,int index2) {
        char temp;

        char[] temparray = str.toCharArray();

        temp = temparray[index];

        temparray[index]=temparray[index2];

        temparray[index2]=temp;

        return String.valueOf(temparray);

    }
    public static ArrayList<String> list = new ArrayList<>();
    public static void permute(String str, int l, int r) {
        if(l == r) {
            list.add(str);
            return;
        }
        else {
            for(int i = l; i<=r; i++) {
                str = swap(str, l, i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
        

    }

    public static List<String> findPermutations(String s) {
        // Write your code here.
        permute(s,0,s.length()-1);
        return list;
    }



    public static void main(String args[]) {

        System.out.print(findPermutations("abc"));
    }

}