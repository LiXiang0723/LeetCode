package implementations;

public class ClimbStairs {
    public int climbStairs(int n) {
	if (n == 0) {
	    return 0;
	}

	if (n == 1) {
	    return 1;
	}

	if (n == 2) {
	    return 2;
	}

	int oneStepLower = 2;
	int twoStepLower = 1;
	int res = 0;

	// Ways to reach N step = Ways to reach n-1 +ways to reach n-2
	for (int i = 3; i <= n; i++) {
	    res = oneStepLower + twoStepLower;
	    twoStepLower = oneStepLower;
	    oneStepLower = res;
	}

	return res;
    }
}
