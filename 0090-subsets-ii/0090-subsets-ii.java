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
        
        // 1 2 2
        
        ans.add(new ArrayList(set));
        
        for(int i = index; i < nums.length; i++) {
            // skip? backtracking으로 추가되는 다음 인덱스와 for loopd에서 추가되는 다음 인덱스가 중복된다
            if(i > index && nums[i] == nums[i-1]) continue;
            set.add(nums[i]);
            backtracking(nums, i + 1, set, ans);
            set.remove(set.size() - 1);
        }
    }
}