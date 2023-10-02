class Solution {
    
    private Integer[] mem;
    
    public int minCostClimbingStairs(int[] cost) {
        // 10 15 20
        mem = new Integer[cost.length];
        
        int ans = Math.min(dp(cost, 0), dp(cost, 1));
        
        for(int m : mem) {
            System.out.println(m);
        }
        
        return ans;
    }
    
    private int dp(int[] cost, int index) {
        if(index >= cost.length) return 0;
        
        if(mem[index] != null) return mem[index];
        
        return mem[index] = cost[index] + Math.min(dp(cost, index + 1), dp(cost, index + 2));
    }
}