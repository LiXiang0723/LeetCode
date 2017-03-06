package implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	if (nums.length < 3) {
	    return result;
	}

	Arrays.sort(nums);

	int i = 0;
	while (i < nums.length - 2) {
	    int j = i + 1;
	    int k = nums.length - 1;
	    while (j < k) {
		if (nums[j] + nums[k] == -nums[i]) {
		    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
		    j++;
		    k--;
		    while (nums[j] == nums[j - 1] && j < k) {
			j++;
		    }
		    while (nums[k] == nums[k + 1] && k > j) {
			k--;
		    }
		} else if (nums[j] + nums[k] < -nums[i]) {
		    j++;
		    while (nums[j] == nums[j - 1] && j < k) {
			j++;
		    }
		} else {
		    k--;
		    while (nums[k] == nums[k + 1] && k > j) {
			k--;
		    }
		}
	    }
	    i++;
	    while (nums[i] == nums[i - 1] && i < nums.length - 2) {
		i++;
	    }
	}
	return result;
    }
}
