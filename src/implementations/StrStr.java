package implementations;

public class StrStr {
    // Time:O(N^2)
    // Space: Constant
    public int strStr(String haystack, String needle) {
	if (needle.length() == 0) {
	    return 0;
	}

	if (haystack.length() == 0) {
	    return -1;
	}

	if (haystack.length() < needle.length()) {
	    return -1;
	}

	int result = -1;
	for (int i = 0; i < haystack.length(); i++) {
	    if (haystack.charAt(i) == needle.charAt(0)
		    && haystack.length() - i >= needle.length()) {
		result = i;
		for (int j = 0; j < needle.length(); j++) {
		    if (haystack.charAt(i + j) != needle.charAt(j)) {
			result = -1;
			break;
		    }
		}
		if (result != -1) {
		    break;
		}
	    }
	}

	return result;
    }
}
