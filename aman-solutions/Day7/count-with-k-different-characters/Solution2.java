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
        int count = 0;

        for(int i = 0; i<str.length();i++) {
            char[] charcount = new char[26];
            int distinctcount = 0;
            for(int j = i; j < str.length(); j++) {
                if(charcount[str.charAt(j)-'a'] == 0) {
                    charcount[str.charAt(j)-'a']++;
                    distinctcount++;
                }

                if(distinctcount == k)
                {
                    count++;
                }
                if(distinctcount>k)
                    break;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countSubStrings("abcab",2));
    }
}