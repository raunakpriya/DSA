class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = 0;
        for(int pile : piles) {
            maxi = Math.max(maxi, pile);
        }
        int start = 0; 
        int end = maxi;
        int result = end;

        while(start <= end) {
            int mid = start + (end - start)/2;

            long rate = 0;

            for(int pile : piles) {
                rate += Math.ceil((double)pile/mid);
            }
            if(rate > h) {
                start = mid + 1;
            } else {
                end = mid - 1;
                result = mid;
            }
        }
        return result;
    }
}
