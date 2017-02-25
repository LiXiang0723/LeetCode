package main;

//Time: O(n)
//Space:O(m*n)
public class ZigZagConversion {
	 public String convert(String s, int numRows) {
	        if(numRows<2){
	            return s;
	        }
	        
	        StringBuilder[] sbs = new StringBuilder[numRows];
	        for(int k=0;k<numRows;k++){
	            sbs[k] = new StringBuilder("");
	        }
	        
	      
	        int index = 0;
	        int increment = 1;
	        for(int i=0;i<s.length();i++){
	            sbs[index].append(s.charAt(i));
	            if(index ==0){
	                increment = 1;
	            } else if (index == numRows-1) {
	                increment = -1;
	            }
	            index +=increment;
	        }
	        
	        StringBuilder result = new StringBuilder("");
	        for (int j=0;j<numRows;j++){
	            result.append(sbs[j]);
	        }
	        
	        return result.toString();
	    }
}
