class Solution {
    public int[] productExceptSelf(int[] nums) {
        // -1 1 0 -3 3
        // 1 -1 -1 0  0
        
        // 1 2 3 4
        // 1 1 2 6
        // 24
        
        
        int len = nums.length;
        int[] ans = new int[len];
        
        ans[0] = 1;
        for(int i = 1; i < len; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        
        int prev = 1;
        for(int i = len - 1; i >= 0; i--) {
            ans[i] *= prev;
            prev *= nums[i];
        }
        return ans;
    }
}