package implementations;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //Time: O(N)
    //Space:O(N)
    public boolean containsDuplicate(int[] nums) {
        if (nums.length<2){
            return false;
        }
        Set<Integer> intSet = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(intSet.contains(nums[i])){
                return true;
            }
            intSet.add(nums[i]);
        }
        
        return false;
    }
}
