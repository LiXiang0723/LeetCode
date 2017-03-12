package implementations;

public class LengthOflastWord {

    public int lengthOfLastWord(String s) {
	s = s.trim();
	if (s.length() < 1) {
	    return 0;
	}

	int i = s.length() - 1;
	while (i > -1) {
	    if (s.charAt(i) == ' ') {
		break;
	    }
	    i--;
	}
	return s.length() - 1 - i;
    }

}
