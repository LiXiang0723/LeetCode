package implementations;

public class RemoveDuplicates {
    // Time:O(N)
    // Space:constant
    public int removeDuplicates(int[] nums) {
	if (nums.length == 0) {
	    return 0;
	}

	if (nums.length == 1) {
	    return 1;
	}

	int i = 0;
	int j = i + 1;
	while (j < nums.length) {
	    if (nums[i] == nums[j]) {
		j++;
	    } else {
		i++;
		nums[i] = nums[j];
	    }
	}

	return i + 1;
    }
}
