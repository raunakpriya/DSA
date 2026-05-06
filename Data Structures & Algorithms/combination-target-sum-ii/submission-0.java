class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, result, list, 0, 0);
        return result;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> result, List<Integer> list, int start, int total) {
        if(total == target) {
            result.add(new ArrayList<>(list));
        }
        for(int i = start ; i < candidates.length ; i++) {
            if(i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if(total + candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            dfs(candidates, target, result, list, i + 1, total + candidates[i]);
            list.remove(list.size() - 1);
        }
    }
}
