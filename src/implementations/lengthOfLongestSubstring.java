package implementations;

import java.util.ArrayList;
import java.util.List;


//Time complexity O(n)
public class lengthOfLongestSubstring {

public int lengthOfLongestSubstring(String s) {
    int size = s.length();
    int result = 0;
    int i=0;
    int j=0;
    List<Character> list = new ArrayList<Character>();
    while(i<size&&j<size){
      if(list.indexOf(s.charAt(j))==-1){
          list.add(s.charAt(j));
          j++;
          result = Math.max(result,j-i);
      }else{
          list.remove(list.indexOf(s.charAt(i)));
          i++;
      }
    }
    return result;
  }
}