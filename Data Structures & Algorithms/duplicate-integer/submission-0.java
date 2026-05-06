class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++) {
            if(!hash.contains(nums[i])) {
                hash.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}
