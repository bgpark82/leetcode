class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        // 1 2 3
        List<List<Integer>> ans = new ArrayList();
        List<Integer> step = new ArrayList();
        
        bt(nums, 0, step, ans);
        
        return ans;
    }
    
    
    private void bt(int[] nums, int idx, List<Integer> step, List<List<Integer>> ans) {
        // [] [1] [1,2] [1,2,3] 
        
        ans.add(new ArrayList(step));
        
        for(int i = idx; i < nums.length; i++) {
            step.add(nums[i]); 
            bt(nums, i + 1, step, ans);
            step.remove(step.size() - 1);
        }
    }
}