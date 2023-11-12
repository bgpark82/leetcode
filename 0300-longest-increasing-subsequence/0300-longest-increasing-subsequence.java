class Solution {
    
    int max = 0;
    
    public int lengthOfLIS(int[] nums) {
        // 0 1 0 3 2 3
        //         i
        //           j
        //      
        // 1 1 1 1 2 1
        int len = nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        
        for(int i = nums.length - 1; i >= 0; i--) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] >= nums[j]) continue;
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        Arrays.sort(dp);
        return dp[dp.length - 1];
    }
}