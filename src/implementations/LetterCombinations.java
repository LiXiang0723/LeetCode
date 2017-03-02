package implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Time:O(n^length)
//Space:O(digitsLength)
public class LetterCombinations {
	 public List<String> letterCombinations(String digits) {
	        Map<Character,String> map = new HashMap<Character,String>();
	        map.put('2',"abc");
	        map.put('3',"def");
	        map.put('4',"ghi");
	        map.put('5',"jkl");
	        map.put('6',"mno");
	        map.put('7',"pqrs");
	        map.put('8',"tuv");
	        map.put('9',"wxyz");
	        
	       
	        List<String> result = new ArrayList<String>();
	        int length = digits.length();
	        if(length == 0||digits.contains("1")||digits.contains("0")){
	            return result;
	        }
	    
	        
	        String[] inputs = new String[length];
	        for(int i =0;i<length;i++){
	            inputs[i] = map.get(digits.charAt(i));
	        }
	        
	        
	        int index = 0;
	        while(index<length){
	            String currentInput = inputs[index];
	           
	                if(index==0){
	                  for(int j =0;j<currentInput.length();j++){
	                    result.add(String.valueOf(currentInput.charAt(j)));
	                  }
	                }else{
	                  List<String> tmp = new ArrayList<String>();
	                  for(String s:result){
	                    for(int j =0;j<currentInput.length();j++){
	                     StringBuilder sb = new StringBuilder(s);
	                     String newString = sb.append(currentInput.charAt(j)).toString();
	                     tmp.add(newString);
	                    }
	                  }
			  result =tmp;
	               }
	            index++;
	      }
	      return result;
	 }
}
