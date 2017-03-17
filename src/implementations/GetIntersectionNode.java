package implementations;

import common.ListNode;

public class GetIntersectionNode {
    // Time:O(N+M+min(N,M)-intersectionLength)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	if (headA == null || headB == null) {
	    return null;
	}

	if (headA == headB) {
	    return headA;
	}

	int lengthA = 0;
	int lengthB = 0;
	ListNode currA = headA;
	ListNode currB = headB;
	while (currA != null) {
	    currA = currA.next;
	    lengthA++;
	}

	while (currB != null) {
	    currB = currB.next;
	    lengthB++;
	}

	int dif = Math.abs(lengthA - lengthB);
	currA = headA;
	currB = headB;
	if (lengthA > lengthB) {
	    while (dif > 0) {
		currA = currA.next;
		dif--;
	    }
	} else if (lengthB > lengthA) {
	    while (dif > 0) {
		currB = currB.next;
		dif--;
	    }
	}

	while (currA != currB) {
	    if (currA == null || currB == null) {
		return null;
	    }
	    currA = currA.next;
	    currB = currB.next;
	}

	return currA;
    }
}
