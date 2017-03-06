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
public class LongestCommonPrefix {
    //Time: O(N*M) N=# of strings in array, M = length of string
    //Space: constant
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        
        if(strs.length == 1){
            return strs[0];
        }
        
        StringBuilder sb = new StringBuilder("");
       
        //Use i to scan all arrays from first element.
        int i =0;
        while(i<strs[0].length()){
            for(int j =0;j<strs.length-1;j++){
                //Compare ith element from each array ,return the StringBuilder
                //result if i reaches the end of any array or elements are not 
                //equal.
                if(strs[j].length()>i && strs[j+1].length()>i){
                   if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                     return sb.toString();
                   }
                }else{
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
            i++;
        }
        
        return sb.toString();
    }
}
