import java.io.*;
import java.util.* ;

public class Solution {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        // Write your code here
        int missingnumber = arr.get(0);


        for(int i =0;i<arr.size();i++){
            if((arr.size()-1)>i && (arr.get(i)-arr.get(i+1))==0){
                i++;
            }
            else
                return arr.get(i);    
        }
        return missingnumber;
    }

    public static void main(String args[]) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(151,151,167,224,224,227,227,300,300,329,329,392,392,468,468,538,538,583,583,665,665,688,688,710,710,768,768,861,861,937,937,938,938,942,942,1004,1004,1006,1006,1062,1062,1065,1065,1148,1148,1237,1237,1255,1255,1288,1288,1358,1358,1380,1380,1457,1457,1526,1526,1552,1552,1587,1587,1629,1629,1675,1675,1694,1694,1734,1734,1814,1814,1902,1902,1952,1952,2019,2019,2113,2113,2211,2211,2298,2298));
        System.out.print(singleNonDuplicate(numbers));
    }
    
}
