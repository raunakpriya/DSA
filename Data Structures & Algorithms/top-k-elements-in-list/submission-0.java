class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
        }
        for(int i = 0 ; i < k ; i++) {
            result[i] = heap.poll()[1];
        }
        return result;

    }
}
