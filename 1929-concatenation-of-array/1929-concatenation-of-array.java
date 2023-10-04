class Solution {
    public int[] getConcatenation(int[] nums) {
        // 0 1 2 3 4 5 6
        
        int len = nums.length * 2;
        int[] ans = new int[len];

        for(int i = 0; i < len; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }
}