class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        if(candidates == null || candidates.length == 0) return new ArrayList();
        
        List<Integer> set = new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        
        dfs(candidates, target, 0, set, ans, 0);
        
        return ans;
    }
    
    private void dfs(int[] candidates, int target, int sum, List<Integer> set, List<List<Integer>> ans, int index) {
        // 8 7 4 3
        // 4 4 
        if (sum > target) return;
        else if(sum == target) {
            ans.add(new ArrayList(set));
        } else {
            for(int i = index; i < candidates.length; i++) {
                set.add(candidates[i]);
                dfs(candidates, target, sum + candidates[i], set, ans, i);
                set.remove(set.size() - 1);
            }            
        }
    }
}