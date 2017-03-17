/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author l7xiang
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates.length ==0){
            return result;
        }
        
        Arrays.sort(candidates);
        helper(result,new ArrayList<Integer>(),candidates,target,0);
        return result;
    }
    
    private void helper(List<List<Integer>> result,List<Integer> currList,int[] candidates,int remain,int start){
        if(remain >0){
            for(int i =start ;i<candidates.length;i++){
                if(i!=start&&candidates[i]==candidates[i-1]){
                    continue;
                }
                currList.add(candidates[i]);
                helper(result,currList,candidates,remain - candidates[i],i+1);
                currList.remove(currList.size()-1);
            }
        }else if (remain<0){
            return;
        }else {
            result.add(new ArrayList<Integer>(currList));
            return;
        }
    
    }

}
