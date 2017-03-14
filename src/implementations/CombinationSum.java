package implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	if (candidates.length == 0) {
	    return result;
	}

	Arrays.sort(candidates);
	helper(result, new ArrayList<Integer>(), candidates, target, 0);
	return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> currList,
	    int[] candidates, int remain, int start) {
	if (remain > 0) {
	    for (int i = start; i < candidates.length; i++) {
		currList.add(candidates[i]);
		helper(result, currList, candidates, remain - candidates[i], i);
		currList.remove(currList.size() - 1);
	    }
	} else if (remain < 0) {
	    return;
	} else {
	    result.add(new ArrayList<Integer>(currList));
	    return;
	}
    }

}
