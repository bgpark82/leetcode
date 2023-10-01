class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0) return new ArrayList();
        
        List<List<Integer>> ans = new ArrayList();
        List<Integer> step = new ArrayList();
        
        bt(candidates, 0, step, ans, target, 0);
        
        return ans;
    }
    
    private void bt(int[] candidates, int index, List<Integer> step, List<List<Integer>> ans, int target, int sum) {

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