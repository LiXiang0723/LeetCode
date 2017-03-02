package implementations;

import java.util.ArrayList;
import java.util.List;


//Time:O(n)
//Space:O(n)
public class ValidParentheses {
	public boolean isValid(String s) {
	      List<Character> list = new ArrayList<Character>();
	      
	      int i =0;
	      int size = s.length();
	      
	      while(i<size){
	          if(s.charAt(i) == '(' ||s.charAt(i)=='[' ||s.charAt(i)=='{'){
	              list.add(s.charAt(i));
	          }else{
	              if(list.isEmpty()){
	                  return false;
	              }
	              if(s.charAt(i)==')'){
	                  if(list.get(list.size()-1) !='('){
	                      return false;
	                  }else{
	                      list.remove(list.size()-1);
	                  }
	              }else if(s.charAt(i)==']'){
	                  if(list.get(list.size()-1) !='['){
	                      return false;
	                  }else{
	                      list.remove(list.size()-1);
	                  }
	              }else if(s.charAt(i)=='}'){
	                  if(list.get(list.size()-1) !='{'){
	                      return false;
	                  }else{
	                      list.remove(list.size()-1);
	                  }
	              }
	          }
	          i++;
	      }
	      return list.isEmpty();
	    }
}
