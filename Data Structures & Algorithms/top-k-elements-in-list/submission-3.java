class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] result = new int[k];
        int maxValue = 0;

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> (b[0] - a [0]));

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(new int[]{entry.getValue(), entry.getKey()});
        }

        for(int i = 0 ; i < k ; i++) {
            result[i] = queue.poll()[1];
        }

        return result;
    }
}
