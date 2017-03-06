package implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {
    // Time:O(n^2)
    // Space:constant
    public int threeSumClosest(int[] nums, int target) {

	if (nums.length == 3) {
	    return nums[0] + nums[1] + nums[2];
	}

	List<Integer> list = new ArrayList<Integer>();
	Arrays.sort(nums);
	int i = 0;
	boolean targetSmaller = false;
	while (i < nums.length - 2) {
	    int j = i + 1;
	    int k = nums.length - 1;
	    // Initialize the list with the abs value of the 1st iteration
	    if (list.isEmpty()) {
		list.add(Math.abs(target - (nums[j] + nums[k] + nums[i])));
		targetSmaller = (target - (nums[j] + nums[k] + nums[i]) < 0);
	    }
	    while (j < k) {
		int dif = target - (nums[j] + nums[k] + nums[i]);
		// Find the new result candidate
		if (Math.abs(dif) < list.get(0)) {
		    targetSmaller = (dif < 0);
		    list.clear();
		    list.add(Math.abs(dif));
		}

		// move the cursor based on the current difference.
		if (dif < 0) {
		    k--;
		} else if (dif > 0) {
		    j++;
		} else {
		    k--;
		    j++;
		}
	    }
	    i++;
	}
	return target + (targetSmaller == true ? list.get(0) : -list.get(0));
    }
}
