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
public class PermutationII {
     //Time:O(N!)
     public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0){
            return result;
        }
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        helper(result,new ArrayList<Integer>(),nums,used);
        return result;
        
    }
    
    private void helper(List<List<Integer>> result,List<Integer> currList,int[] nums,boolean[] used){
        if(currList.size()<nums.length){
            for(int i=0;i<nums.length;i++){
                if(used[i]){
                    continue;
                }
                if(i!=0&&nums[i]==nums[i-1]&&!used[i-1]){
                    continue;
                }
                
                currList.add(nums[i]);
                used[i]=true;
                helper(result,currList,nums,used);
                currList.remove(currList.size()-1);
                used[i]=false;
            }
        }else{
            result.add(new ArrayList<Integer>(currList));
        }
    }
}
