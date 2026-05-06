class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        int[] result = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0 ; i < numCourses ; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites) {
            indegree[pre[1]]++;
            adj.get(pre[0]).add(pre[1]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < numCourses ; i++) {
            if(indegree[i] == 0) {
                queue.add(i);
            }
        }
        int finish = 0;
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            result[numCourses - finish - 1] = curr;
            finish++;
            for(int neigh : adj.get(curr)) {
                indegree[neigh]--;
                if(indegree[neigh] == 0) {
                    queue.add(neigh);
                }
            }
        }
        if(finish != numCourses) {
            return new int[0];
        }
        return result;
    }
}
