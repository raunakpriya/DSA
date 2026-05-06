class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        dfs(nums, 0 , list, result);
        return result;
    }
    public void dfs(int[] nums, int start, List<Integer> list, List<List<Integer>> result) {
        if(start >= nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[start]);
        dfs(nums, start + 1, list, result);

        list.remove(list.size() - 1);
        dfs(nums, start + 1, list, result);
    }
}
