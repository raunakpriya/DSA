class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int water = 0;

        while(start < end) {
            water = Math.max(water, (Math.min(heights[start], heights[end]) * (end - start)));
            if(heights[start] <= heights[end]) {
                start++;
            } else {
                end --;
            }
        }
        return water;

    }
}
