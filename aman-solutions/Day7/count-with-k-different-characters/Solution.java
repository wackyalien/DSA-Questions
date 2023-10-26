import java.util.*;

public class Solution {

    public static ArrayList<String> combinations = new ArrayList<String>();
    public static Map<String, Integer> allcombinations  = new HashMap<String, Integer>();

    public static void createAllSubstrings(String str, int index, String combinationstr, int k, int charcount) {

        System.out.println("checking "+combinationstr+" " +index+" "+str.length()+" "+('c'-'a'));
        if(charcount == k) {
            if(!allcombinations.containsKey(combinationstr) ){
                combinations.add(combinationstr);
                allcombinations.put(combinationstr,1);
            }
            // return;
        }
        if(index>=str.length())
            return;
        // if((combinationstr).indexOf(str.charAt(index))==-1)
        createAllSubstrings(str, index+1, combinationstr+str.charAt(index), k, charcount+(((combinationstr).indexOf(str.charAt(index)))==-1?1:0));
        if(combinationstr.length()==0)
            createAllSubstrings(str, index+1, combinationstr, k, charcount);
        return;
    }

    public static int countSubStrings(String str, int k) {
        // Write your code here.
        createAllSubstrings(str, 0, "", k,0);
        System.out.println(combinations);
        return allcombinations.size();
    }

    public static void main(String args[]) {
        System.out.println(countSubStrings("ewssx",1));
    }
}