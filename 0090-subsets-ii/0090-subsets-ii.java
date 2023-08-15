class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        if (nums == null || nums.length == 0) return new ArrayList();
        
        Arrays.sort(nums);
        
        List<Integer> set = new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        
        backtracking(nums, 0, set, ans);
        
        return ans;
    }
    
    private void backtracking(int[] nums, int index, List<Integer> set, List<List<Integer>> ans) {
        
        if(!ans.contains(set)) ans.add(new ArrayList(set));
        
        
        for(int i = index; i < nums.length; i++) {
            set.add(nums[i]);
            backtracking(nums, i + 1, set, ans);
            set.remove(set.size() - 1);
        }
    }
}