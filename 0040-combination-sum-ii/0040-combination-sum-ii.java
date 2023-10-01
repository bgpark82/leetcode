class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        if(candidates == null || candidates.length == 0) return new ArrayList();
        Arrays.sort(candidates);
        
        List<List<Integer>> ans = new ArrayList();
        List<Integer> step = new ArrayList();
        
        bt(candidates, 0, step, ans, target, 0);
        
        return ans;
    }
    
    private void bt(int[] candidates, int index, List<Integer> step, List<List<Integer>> ans, int target, int sum) {
        
        if(sum > target) return;
        if(sum == target) {
            // if(ans.contains(step)) return;
            ans.add(new ArrayList(step));
            return;    
        }
        
        for(int i = index; i < candidates.length; i++) {
            if(i > index && candidates[i] == candidates[i - 1]) continue;
            step.add(candidates[i]);
            bt(candidates, i + 1, step, ans, target, sum + candidates[i]);
            step.remove(step.size() - 1);
        }
    }
}