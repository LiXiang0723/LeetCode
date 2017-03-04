package implementations;

public class MergeSort {

    // Time; O(NlogN)
    // Space:O(n)
    public void mergeSort(int[] nums, int lo, int hi) {
	if (lo < hi) {
	    int pivot = lo + (hi - lo) / 2;
	    mergeSort(nums, lo, pivot);
	    mergeSort(nums, pivot + 1, hi);
	    merge(nums, lo, pivot, hi);
	}
    }

    private void merge(int[] nums, int lo, int pivot, int hi) {

	int[] result = new int[nums.length];
	for (int n = 0; n < nums.length; n++) {
	    result[n] = nums[n];
	}
	int i = lo;
	int j = pivot + 1;
	int k = lo;
	while (i <= pivot && j <= hi) {
	    if (result[i] < result[j]) {
		nums[k++] = result[i++];
	    } else {
		nums[k++] = result[j++];
	    }
	}

	while (i <= pivot) {
	    nums[k++] = result[i++];
	}

	while (j <= hi) {
	    nums[k++] = result[j++];
	}
    }
}
