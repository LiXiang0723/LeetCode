/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

/**
 *
 * @author l7xiang
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        
        return helper(countAndSay(n-1));
    }
    
    private String helper(String s){
        int count = 1;
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
                //Reaches the last element,return the current string
                if(i==s.length()-1){
                    sb.append(count);
                    sb.append(s.charAt(i));
                    return sb.toString();
                }
                
                if(s.charAt(i+1)==s.charAt(i)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(s.charAt(i));
                    count=1;
                }
                i++;
        }
        return sb.toString();
    }
}
