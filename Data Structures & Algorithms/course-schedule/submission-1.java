class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
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
        int count = 0;
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            count++;
            for(int neigh : adj.get(curr)) {
                indegree[neigh]--;
                if(indegree[neigh] == 0) {
                    queue.add(neigh);
                }
            }
        }
        return count == numCourses;
    }
}
