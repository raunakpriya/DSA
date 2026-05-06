class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int result = nums[0];

        while(start <= end) {
            if(nums[start] < nums[end]) {
                result = Math.min(result, nums[start]);
                break;
            }
            int mid = start + (end - start)/2;
            result = Math.min(result, nums[mid]);
            if(nums[start] <= nums[mid]) {
                start = mid + 1;
            } else { 
                end = mid - 1;
            }
        }
        return result;
    }
}
