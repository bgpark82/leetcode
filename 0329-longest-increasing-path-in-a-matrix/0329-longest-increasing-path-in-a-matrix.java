class Solution {
    
    int max = 0;
    List<Integer> ans = new ArrayList();
    
    public int longestIncreasingPath(int[][] matrix) {
        
        int[][] cache = new int[matrix.length][matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, dfs2(matrix, i, j, cache, Long.MAX_VALUE));
            }
        }
        
        return max;
        
//         boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        
//         for(int i = 0; i < matrix.length; i++) {
//             for(int j = 0; j < matrix[0].length; j++) {
//                 List<Integer> path = new ArrayList();
//                 dfs(matrix, i, j, visited, path);   
//                 visited = new boolean[matrix.length][matrix[0].length];
                
//             }
//         }
//         return max;
    }
    
    private int dfs2(int[][] matrix, int i, int j, int[][] cache, long pre) {
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] >= pre) return 0;

        // if already visited, 
        if(cache[i][j] > 0) return cache[i][j];
        else {
            int cur = matrix[i][j];
            int temp = 0;
            temp = Math.max(dfs2(matrix, i - 1, j, cache, cur), temp);
            temp = Math.max(dfs2(matrix, i + 1, j, cache, cur), temp);
            temp = Math.max(dfs2(matrix, i, j - 1, cache, cur), temp);
            temp = Math.max(dfs2(matrix, i, j + 1, cache, cur), temp);
            cache[i][j] = ++temp;
            return temp;
        }
        
    }
    
    
    private void dfs(int[][] matrix, int i, int j, boolean[][] visited, List<Integer> path) {
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || visited[i][j]) return;
        
        if(path.isEmpty() || path.get(path.size()-1) < matrix[i][j]) {
            path.add(matrix[i][j]);
        } else {
            return;
        }
        
        print(path, i, j);
        
        visited[i][j] = true;
        
        dfs(matrix, i + 1, j, visited, path);
        dfs(matrix, i - 1, j, visited, path);
        dfs(matrix, i, j + 1, visited, path);
        dfs(matrix, i, j - 1, visited, path);
        
        max = Math.max(max, path.size());
        path.remove(path.size()-1);
    }
    
    private void print(List<Integer> path, int i, int j) {
        for(int p : path) {
            System.out.print(path + " ");
        }
        System.out.println(" i=" + i + " j=" + j);
    }
}