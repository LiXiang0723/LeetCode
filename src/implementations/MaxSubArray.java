package implementations;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
	int maxSum = nums[0];
	int curSum = nums[0];

	for (int i = 1; i < nums.length; i++) {
	    if (curSum < 0) {
		curSum = nums[i];
	    } else {
		curSum += nums[i];
	    }
	    maxSum = Math.max(curSum, maxSum);
	}

	return maxSum;
    }
}
