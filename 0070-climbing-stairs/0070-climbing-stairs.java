class Solution {
    
    Integer[] tmp;
    
    public int climbStairs(int n) {
        
        
        tmp = new Integer[n + 1];
        
        return dfs(n);
    }
    
    private int dfs(int n) {
        if(n == 1 || n == 0) return 1;
        if(tmp[n] != null) return tmp[n];
        
        tmp[n] = dfs(n - 1) + dfs(n - 2);
        return tmp[n];
    }
}