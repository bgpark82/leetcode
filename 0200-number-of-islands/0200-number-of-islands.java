class Solution {
    
    private boolean[][] check;
    private int[] dx = new int[] {-1, 0, 1, 0};
    private int[] dy = new int[] {0, -1, 0, 1};
    private int count = 0;
    
    
    public int numIslands(char[][] grid) {
        
        
        check = new boolean[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(!check[i][j] && grid[i][j] == '1') {
                    bfs(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    
    private void bfs(char[][] grid, int i, int j) {
        
        Deque<int[]> queue = new ArrayDeque();
        queue.addLast(new int[] {i, j});
        
        while(!queue.isEmpty()) {
            
            int[] pos = queue.removeFirst();
            check[i][j] = true;
            
            for(int k = 0; k < 4; k++) {
                int x = pos[0] + dx[k];
                int y = pos[1] + dy[k];
                
                if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || check[x][y] || grid[x][y] == '0') continue;

                queue.addLast(new int[] {x, y});
                check[x][y] = true;
            }
        }
        count++;
    }
}