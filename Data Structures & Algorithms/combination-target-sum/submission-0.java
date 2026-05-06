class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, list, result, target, 0);
        return result;
    }
    public void dfs(int[] nums, int start, List<Integer> list, List<List<Integer>> result, int target, int total) {
        if(total == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = start ; i < nums.length ; i++) {
            if(total + nums[i] > target) {
                break;
            }
            list.add(nums[i]);
            dfs(nums, i, list, result, target, total + nums[i]);
            list.remove(list.size() - 1);
            
        }
    }
}
