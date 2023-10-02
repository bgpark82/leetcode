class Solution {
    
    private Integer[] mem;
    
    public int minCostClimbingStairs(int[] cost) {
        mem = new Integer[cost.length];
        
        // return Math.min(dp(cost, 0), dp(cost, 1));
        
        for(int i = 0; i < cost.length; i++) {
            if(i >= 2) mem[i] = cost[i] + Math.min(mem[i-1], mem[i-2]);            
            else mem[i] = cost[i];
        }
        return Math.min(mem[cost.length - 1], mem[cost.length - 2]);
        
    }
    
    private int dp(int[] cost, int index) {
        if(index >= cost.length) return 0;
        
        if(mem[index] != null) return mem[index];
        
        return mem[index] = cost[index] + Math.min(dp(cost, index + 1), dp(cost, index + 2));
    }
}