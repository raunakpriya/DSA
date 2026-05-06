class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int stone : stones) {
            pq.add(-stone);
        }

        while(pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();

            int res = x - y;
            pq.add(res);
        }
        return Math.abs(pq.peek());
    }
}
