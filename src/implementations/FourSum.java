package implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    // Time:O(N^3)
    // Space:O(# Of candidate)
    public List<List<Integer>> fourSum(int[] nums, int target) {
	List<List<Integer>> result = new ArrayList<>();

	if (nums.length < 4) {
	    return result;
	}

	// Sort the array
	Arrays.sort(nums);

	int i = 0;

	// i from start,j is next to it,then use l and k to scan the rest from
	// each end
	while (i < nums.length - 3) {
	    int j = i + 1;
	    while (j < nums.length - 2) {
		int l = j + 1;
		int k = nums.length - 1;
		while (l < k) {
		    if (nums[i] + nums[j] + nums[l] + nums[k] == target) {
			// solution found
			result.add(Arrays.asList(nums[i], nums[j], nums[l],
				nums[k]));
			l++;
			k--;
			// Skip the element if it's duplicate
			while (nums[l] == nums[l - 1] && l < k) {
			    l++;
			}
			// Skip the element if it's duplicate
			while (nums[k] == nums[k + 1] && k > l) {
			    k--;
			}
		    } else if (nums[l] + nums[k] < target - nums[i] - nums[j]) {
			// Only move l because we need find bigger candidate
			l++;
			// Skip the element if it's duplicate
			while (nums[l] == nums[l - 1] && l < k) {
			    l++;
			}
		    } else if (nums[l] + nums[k] > target - nums[i] - nums[j]) {
			// Only move k because we need find bigger candidate
			k--;
			// Skip the element if it's duplicate
			while (nums[k] == nums[k + 1] && k > l) {
			    k--;
			}
		    }
		}

		j++;
		// Skip the element if it's duplicate
		while (nums[j] == nums[j - 1] && j < nums.length - 2) {
		    j++;
		}
	    }
	    i++;
	    // Skip the element if it's duplicate
	    while (nums[i] == nums[i - 1] && i < nums.length - 3) {
		i++;
	    }
	}
	return result;
    }
}
