package implementations;

public class MySqrt {
    // Time:O(logx)
    public int mySqrt(int x) {
	if (x < 0) {
	    throw new ArithmeticException();
	}

	if (x == 0) {
	    return 0;
	}

	int left = 1;
	int right = x;
	int ans = 0;

	while (left <= right) {
	    int mid = left + (right - left) / 2;
	    if (mid > x / mid) {
		right = mid - 1;
	    } else if (mid <= x / mid) {
		left = mid + 1;
		ans = mid;
	    }
	}

	return ans;
    }
}
