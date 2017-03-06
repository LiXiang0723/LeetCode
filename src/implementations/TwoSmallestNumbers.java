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
public class TwoSmallestNumbers {
    //Time:O(N)
    //Space: constant
    public int[] twoSmallestNumbers(int[] nums){
        int[] result = new int[2];
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            //If it's smaller than first number, 
            //update the first and first will be second 
            if(nums[i]<=first){
                second = first;
                first = nums[i];
            }else if (nums[i]<=second){
                //otherwise update second
                second = nums[i];
            }
        }
        
        result[0] = first;
        result[1] =second;
        
        return result;
    }
}
