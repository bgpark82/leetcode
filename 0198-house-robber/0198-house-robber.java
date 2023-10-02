class Solution {
    
    private Integer[] dp;
    
    public int rob(int[] nums) {
        
        // 1, 2, 3, 1
        // 1 -> Math.max(3, 1);
        // 2 -> Math.max(1);
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[1],nums[0]);
        
        
        dp = new Integer[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        
        for(int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
    
    private int rob(int[] nums, int index) {
        // index = 0, 2 -> 3
        // max.       0    0
        // 
        if(index >= nums.length) return 0;
        if(dp[index] != null) return dp[index];
        
        int max = 0;
        for(int i = index + 2; i < nums.length; i++) {
            max = Math.max(max, rob(nums, i));
        }
        
        return dp[index] = nums[index] + max;
    }
}