package implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Time complexity O(n)
public class lengthOfLongestSubstring {

 public int lengthOfLongestSubstring(String s) {
        int i =0;
        int j =0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int size = s.length();
        int result = 0;
        while(i<size && j<size){
            if( map.containsKey(s.charAt(j))){
                //Only updated i if the duplicated character'index is not smaller than i
                if(map.get(s.charAt(j))>=i){
                    i=map.get(s.charAt(j))+1;
                }
            }
                map.put(s.charAt(j),j);
                result = Math.max(result,j-i+1);
                j++;
        }
        return result;
    }
}