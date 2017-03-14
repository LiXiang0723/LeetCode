/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author l7xiang
 */
public class Permutations {
        public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> digits = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            digits.add(nums[i]);
        }
        
        helper(result,new ArrayList<Integer>(),digits,0);
        return result;
        
    }
    
    private void helper(List<List<Integer>> result,List<Integer> currList, List<Integer> digits, int index){
        if(index < digits.size()){
            for(int i =0;i<digits.size();i++){
                if(currList.indexOf(digits.get(i))==-1){
                    currList.add(digits.get(i));
                    helper(result,currList,digits,index+1);
                    currList.remove(currList.size()-1);
                }
            }
        }else{
            result.add(new ArrayList<Integer>(currList));
        }
    }
}
