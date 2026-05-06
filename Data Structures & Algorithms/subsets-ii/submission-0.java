class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, list, result);
        return result;
    }
    public void dfs(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        
            result.add(new ArrayList<>(list));
            
       
        for(int i = index; i < nums.length ; i++) {
            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }
            list.add(nums[i]);
            dfs(nums, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}
