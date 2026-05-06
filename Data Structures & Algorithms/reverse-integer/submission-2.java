class Solution {
    public int reverse(int x) {
        long result = reverseInt(Math.abs(x), 0) * (x > 0 ? 1 : -1);
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result;
    }
    public long reverseInt(int n, long rev) {
        if(n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reverseInt(n/10, rev);

    }
}
