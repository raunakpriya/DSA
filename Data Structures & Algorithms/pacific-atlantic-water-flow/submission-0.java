class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length ; 
        int m = heights[0].length;

        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        Queue<int[]> pqueue = new LinkedList<>();
        Queue<int[]> aqueue = new LinkedList<>();

        for(int i = 0 ; i < n ; i++) {
            pqueue.offer(new int[]{i, 0});
            pacific[i][0] = true;

            aqueue.offer(new int[]{i, m - 1});
            atlantic[i][m -1] = true;
        }

        for(int j = 0 ; j < m ; j++) {
            pqueue.offer(new int[]{0, j});
            pacific[0][j] = true;

            aqueue.offer(new int[]{n -1, j});
            atlantic[n-1][j] = true;
        }
        bfs(heights, pqueue, pacific);
        bfs(heights, aqueue, atlantic);

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;

    }

    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited) {
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            for(int[] dir : directions) {
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];

                if(x < 0 || y < 0 || x >= heights.length || y >= heights[0].length || visited[x][y] || heights[x][y] < heights[curr[0]][curr[1]]) {
                    continue;
                }
                visited[x][y] = true;
                queue.offer(new int[]{x, y});
            }
        }
    }
}
