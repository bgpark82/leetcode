class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        if (nums == null || nums.length == 0) return new ArrayList();
        
        List<Integer> step = new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        
        dfs(nums, 0, step, ans);
        
        return ans;
    }
    
    
    //      1
    // 2    3 4
    //3 4  2 4
    
    private void dfs(int[] nums, int index, List<Integer> step, List<List<Integer>> ans) {
        if(step.size() == nums.length) {
            ans.add(new ArrayList(step));  
            return;
        }
        
        for(int i = index; i < nums.length; i++) {
            if (!step.contains(nums[i])) {
                step.add(nums[i]);
                dfs(nums, 0, step, ans);
                step.remove(step.size() - 1);    
            }
        }
    }
    
    
}