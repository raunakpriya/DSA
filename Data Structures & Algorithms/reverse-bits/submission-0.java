class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0 ; i < 32 ; i++) {
            int msb = ((n >> i) & 1);
            res += msb << (31 - i);
            

        }
        return res;
    }
}
