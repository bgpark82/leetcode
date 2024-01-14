class Solution {
    public void solve(char[][] board) {
        // x x x x x
        // t t x x x
        // t x o o x
        // x x x x x
        // x x x x x
        
        int rows = board.length;
        int cols = board[0].length;
        
        boolean[][] visited = new boolean[rows][cols];
        
        for(int r = 0; r < rows; r++) {
            dfs(board, r, 0, visited);
            dfs(board, r, cols - 1, visited);
        }
        
        for(int c = 0; c < cols; c++) {
            dfs(board, 0, c, visited);
            dfs(board, rows - 1, c, visited);
        }
        
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(board[r][c] == 'O') dfs2(board, r, c, visited);
            }
        }
    }
    
    private void dfs(char[][] board, int r, int c, boolean[][] visited) {
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 'X' || visited[r][c]) return;
        
        visited[r][c] = true;
        
        dfs(board, r + 1, c, visited);
        dfs(board, r - 1, c, visited);
        dfs(board, r, c + 1, visited);
        dfs(board, r, c - 1, visited);
    }
    
    private void dfs2(char[][] board, int r, int c, boolean[][] visited) {
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 'X' || visited[r][c]) return;
        
        board[r][c] = 'X';
        
        dfs2(board, r + 1, c, visited);
        dfs2(board, r - 1, c, visited);
        dfs2(board, r, c + 1, visited);
        dfs2(board, r, c - 1, visited);
    }
}