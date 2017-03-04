package implementations;

public class QuickSort {
    public void quickSort(int[] array, int lo, int hi) {
	if (lo < hi) {
	    int pi = partition(array, lo, hi);
	    quickSort(array, 0, pi - 1);
	    quickSort(array, pi + 1, hi);
	}
    }

    private int partition(int[] array, int lo, int hi) {
	int pivot = lo + (hi - lo) / 2;
	int tmp = array[pivot];

	// swap pivot with last element
	array[pivot] = array[hi];
	array[hi] = tmp;

	int i = lo;

	for (int j = lo; j < hi; j++) {
	    if (array[j] < array[hi]) {
		tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
		i++;
	    }
	}
	tmp = array[hi];
	array[hi] = array[i];
	array[i] = tmp;

	return i;
    }
}
