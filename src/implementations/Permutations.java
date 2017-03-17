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
    //Time:O(N!)
        public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result,new ArrayList<Integer>(),nums,0);
        return result;
        
    }
    
    private void helper(List<List<Integer>> result,List<Integer> currList, int[] nums, int index){
        if(index < nums.length){
            for(int i =0;i<nums.length;i++){
                if(currList.indexOf(nums[i])==-1){
                    currList.add(nums[i]);
                    helper(result,currList,nums,index+1);
                    currList.remove(currList.size()-1);
                }
            }
        }else{
            result.add(new ArrayList<Integer>(currList));
        }
    }
}
