class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        

        backtrack(0, nums, result);
        return result;
    }
    public void backtrack(int start, int[] nums, List<List<Integer>> result) {
        if(start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int num : nums) {
                list.add(num);
            }
            result.add(list);
            return;
        }
        for(int i = start ; i < nums.length ; i++) {
            swap(nums, i, start);
            backtrack(start + 1, nums, result);
            swap(nums, i, start);
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
