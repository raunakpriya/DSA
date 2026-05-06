class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++) {
            if(hash.contains(nums[i])) {
                return nums[i];
            } else {
                hash.add(nums[i]);
            }
        }
        return -1;
    }
}
