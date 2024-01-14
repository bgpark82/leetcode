class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // 2 3 6 7
        // 2 2 3
        // 7
        List<List<Integer>> ans = new ArrayList();
        List<Integer> step = new ArrayList();
        
        bt(candidates, 0, step, ans, target, 0);
        
        return ans;
    }
    
    private void bt(int[] candidates, int index, List<Integer> step, List<List<Integer>> ans, int target, int sum) {
        // 2 3 6 7
        // 0
        // [2, 2, 3]
        if(sum > target) return;
        
        if(sum == target) {
            ans.add(new ArrayList(step));
            return;
        }
        
        for(int i = index; i < candidates.length; i++) {
            step.add(candidates[i]);
            bt(candidates, i, step, ans, target, sum + candidates[i]);
            step.remove(step.size() - 1);   
        }
    }
    
}