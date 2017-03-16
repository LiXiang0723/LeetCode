package implementations;

public class AddBinary {
    // Time:O(N+M)
    public String addBinary(String a, String b) {

	if (a.length() == 0 && b.length() == 0) {
	    return "0";
	}

	int i = a.length() - 1;
	int j = b.length() - 1;

	int carry = 0;
	StringBuilder result = new StringBuilder();
	while (i > -1 && j > -1) {
	    int sum = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
	    carry = sum >= 2 ? 1 : 0;
	    result.insert(0, sum % 2);
	    i--;
	    j--;
	}

	while (i > -1) {
	    int sum = (a.charAt(i) - '0') + carry;
	    carry = sum >= 2 ? 1 : 0;
	    result.insert(0, sum % 2);
	    i--;
	}

	while (j > -1) {
	    int sum = (b.charAt(j) - '0') + carry;
	    carry = sum >= 2 ? 1 : 0;
	    result.insert(0, sum % 2);
	    j--;
	}

	if (carry == 1) {
	    result.insert(0, 1);
	}

	return result.toString();
    }
}
