package implementations;

public class PlusOne {
    public int[] plusOne(int[] digits) {
	int len = digits.length;
	int carry = 1;
	for (int i = len - 1; i > -1; i--) {
	    int sum = (digits[i] + carry) % 10;
	    carry = (digits[i] + carry) / 10;
	    digits[i] = sum;
	}

	if (carry == 1) {
	    int[] results = new int[len + 1];
	    results[0] = 1;
	    for (int i = 0; i < len; i++) {
		results[i + 1] = digits[i];
	    }
	    return results;
	} else {
	    return digits;
	}

    }
}
