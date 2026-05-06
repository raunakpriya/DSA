class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];

        for(int i = 0 ; i <= n ; i++) {
            int ones = 0;
            int num = i;
            while(num != 0) {
                ones += ((num & 1) == 1) ? 1 : 0;
                num >>= 1;
            }
            res[i] = ones;
        }
        return res;
    }
}
