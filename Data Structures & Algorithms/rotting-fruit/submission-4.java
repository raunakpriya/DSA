class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0 ; i < grid.length ; i++) {
            for(int j = 0 ; j < grid[0].length ; j++) {
                if(grid[i][j] == 1) {
                    fresh++;
                } else if(grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        if(fresh == 0) {
            return 0;
        }
        int minutes = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!queue.isEmpty()) {
            ++minutes;
            int size = queue.size();
            for(int i = 0 ; i < size ; i++) {
                int[] curr = queue.poll();
                for(int[] dir : directions) {
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];

                    if(x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] != 0 && grid[x][y] != 2) {
                        grid[x][y] = 2;
                        queue.offer(new int[]{x, y});
                        fresh--;
                    } else {
                        continue;
                    }
                
                }
            }
            
        }
        return fresh == 0 ? minutes - 1 : -1;
    }
}
