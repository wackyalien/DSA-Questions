import java.util.*;
class Solution {

    public static Map<String,Integer> traversedPath = new HashMap<String,Integer>();
    public static boolean recursivelytraverse(String s, List<String> wordDict, String str,  int index) {

        if(index>=s.length())
            return false;

        String tempstr = str+s.charAt(index);

        // recursivelytraverse(s, wordDict, tempstr, index+1);

        if(wordDict.contains(tempstr)) {
            if((index+1)>=s.length()){
                System.out.println("found "+tempstr+" "+index);
                return true;
            }
            Boolean isPossible = recursivelytraverse(s, wordDict, "", index+1);
            if(isPossible) {
                System.out.println("found 2 "+tempstr+" "+index);
                return true;
            }
        }
        if(traversedPath.containsKey(tempstr))
            return false;
        System.out.println("found 3 "+tempstr+" "+index+ " "+traversedPath.get(tempstr));
        traversedPath.put(tempstr,index);
        return recursivelytraverse(s, wordDict, tempstr, index+1);

    }

    public static boolean wordBreak(String s, List<String> wordDict) {


        
        return recursivelytraverse(s, wordDict, "", 0);
    }

    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        // String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        ArrayList<String> wordDict =  new ArrayList<String>(Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        
        Boolean answer = wordBreak(str, wordDict);
        System.out.println(answer);
    }
}