class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();

        while(!visited.contains(n)) {
            visited.add(n);
            n = squaredSum(n);
            if(n == 1) {
                return true;
            }
        }
        return false;
    }

    public int squaredSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += (n % 10) * (n % 10);
            n = n/10;
        }
        return sum;
    }
}
