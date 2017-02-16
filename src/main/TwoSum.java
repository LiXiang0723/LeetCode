package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                output[0] = map.get(target - nums[i]);
                output[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return output;
    }
}