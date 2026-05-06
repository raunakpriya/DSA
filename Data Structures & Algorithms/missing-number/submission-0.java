class Solution {
    public int missingNumber(int[] nums) {
        int xorR = nums.length;
        for(int i = 0 ; i < nums.length ; i++) {
            xorR ^= i ^ nums[i];
        }
        return xorR;
    }
    
}
