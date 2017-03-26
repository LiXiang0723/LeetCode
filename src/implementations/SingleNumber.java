package implementations;

public class SingleNumber {
    // Time O(N)
    public int singleNumber(int[] nums) {
	if (nums.length == 0) {
	    throw new ArithmeticException();
	}
	int result = nums[0];
	for (int i = 1; i < nums.length; i++) {
	    result ^= nums[i];
	}

	return result;
    }
}
