class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        if(queue.size() == 0) {
            return;
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            for(int[] dir : directions) {
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];

                if(x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != Integer.MAX_VALUE) {
                    continue;
                }
                queue.offer(new int[]{x, y});
                grid[x][y] = grid[curr[0]][curr[1]] + 1;
                
            }
        }
    }
}
