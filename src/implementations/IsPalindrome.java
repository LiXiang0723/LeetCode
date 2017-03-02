package implementations;


//Time:O(n)
//Space:O(1)
public class IsPalindrome {
    public static boolean isPalindrome(int x) {
    	 if(x<0){
             return false;
         }

         int input =x;
         long result =0l;
         while(x>0){
             int mod = x%10;
             result = result*10+mod;
             x = x/10;
         }
         
         if (result > Integer.MAX_VALUE){
             System.out.println("Result overflow");
             return false;
         }
         
         return result == input;
    }
}
