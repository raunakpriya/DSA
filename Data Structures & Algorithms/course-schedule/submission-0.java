class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visiting = new boolean[numCourses];

        for(int i = 0 ; i < numCourses ; i++) {
            map.put(i, new ArrayList<>());
        }
        for(int[] preReq : prerequisites) {
            map.get(preReq[0]).add(preReq[1]);
        }
        for(int c = 0 ; c < numCourses ; c++) {
            if(!dfs(c, map, visiting)) {
                return false;
            }
        }
        return true;
    }

    public boolean dfs(int c, Map<Integer, List<Integer>> map, boolean[] visiting) {
        if(visiting[c] == true) {
            return false;
        }
        if(map.get(c).isEmpty()) {
            return true;
        }
        visiting[c] = true;
        for(int pre : map.get(c)) {
            if(!dfs(pre, map, visiting)) {
                return false;
            }
        }
        visiting[c] = false;

        map.put(c, new ArrayList<>());
        return true;
    }
}
