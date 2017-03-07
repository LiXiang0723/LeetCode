package implementations;

import java.util.Arrays;

public class BinarySearch {
    public static boolean binarySearch(int[] nums, int lo, int hi, int target) {
	if (nums.length == 0) {
	    return false;
	}

	if (nums.length == 1) {
	    return target == nums[0];
	}

	Arrays.sort(nums);

	if (lo <= hi) {
	    int mid = lo + ((hi - lo) / 2);
	    if (nums[mid] == target) {
		return true;
	    } else if (nums[mid] > target) {
		return binarySearch(nums, lo, mid - 1, target);
	    } else {
		return binarySearch(nums, mid + 1, hi, target);
	    }
	} else {
	    return false;
	}

    }
}
