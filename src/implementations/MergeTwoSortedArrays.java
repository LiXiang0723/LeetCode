package implementations;

public class MergeTwoSortedArrays {
    // Time: O(m+n)
    // Space; O(m)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
	int[] tmp = new int[m];

	for (int i = 0; i < m; i++) {
	    tmp[i] = nums1[i];
	}

	int i = 0;
	int j = 0;
	int k = 0;

	while (i < tmp.length && j < n) {
	    if (tmp[i] < nums2[j]) {
		nums1[k++] = tmp[i++];
	    } else {
		nums1[k++] = nums2[j++];
	    }
	}

	while (i < tmp.length) {
	    nums1[k++] = tmp[i++];
	}

	while (j < n) {
	    nums1[k++] = nums2[j++];
	}

    }
}
