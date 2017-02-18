package main;

public class ReverseInteger {
	
	//Time complexity O(n)
	//Space complexity O(n)
	 public int reverse(int x) {
	        boolean isNegative = false;
	        
	        if(x<0){
	            x= -x;
	            isNegative = true;
	        }
	        
	        long result = 0;
	        while(x>0){
	            int mod = x%10;
	            x=x/10;
	            result = result*10+mod;
	        }
	         
	         if(result> Integer.MAX_VALUE){
	            return 0;
	         }
	        if(isNegative){
	            result = -result;
	        }
	     return (int)result;   
	    }
}
