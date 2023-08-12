class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        // 1,2,3
        // i
        // [], [1]. [2]. [3]. [1,2] [1,3] [2,3] [1,2,3]
        
        
        // Backtracking template
        if (nums == null || nums.length == 0) return new ArrayList();
        
        List<List<Integer>> ans = new ArrayList();
        List<Integer> step = new ArrayList();
        bt(nums, 0, step, ans);
        return ans;
    }
    
    /**
     * @param nums: input array
     * @param start: newly assigned start index
     * @param step: combination of input array at index start
     * @param ans: answer
     */
    private void bt(int[] nums, int start, List<Integer> step, List<List<Integer>> ans) {
        ans.add(new ArrayList(step));
        for(int i = start; i < nums.length; i++) {
            step.add(nums[i]);
            bt(nums, i + 1, step, ans);
            step.remove(step.size() - 1);
        }
    }
}