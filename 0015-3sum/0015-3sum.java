class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // if we sort it or not : O(nlogn)
        // brute force : O(n^4logn)
        
        // two sum + 1
        // -4 -1 -1 0 1 2
        //    i     l r  
        // -4 -1 2 = -3 < 0
        // -4 0  2 = -2 < 0
        // -4 1  2 = -1 < 0
        // -1 -1 2 = 0 == 0  add to list
        // -1. 0 1 = 0 == 0  add to list (process has to go on)
        
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet();
        
        for(int i = 0; i < nums.length - 1; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    set.add(Arrays.asList(nums[i], nums[l], nums[r]));    
                    r--; l++;
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;                    
                } else {
                    l++;
                }
            }
        }
        
        return new ArrayList(set);
    }
}