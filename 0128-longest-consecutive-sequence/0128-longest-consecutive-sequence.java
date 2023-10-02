class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet();
        
        for(int n : nums) {
            set.add(n);
        }
        
        // 100, 4, 200, 1, 3, 2
        // 1
        
        int max = 0;
        for(int n : nums) {
            if(set.contains(n - 1)) continue;
            
            int count = 0;
            while(set.contains(n + 1)) {
                n++;
                count++;
            }  
            max = Math.max(max, count + 1);
        }
        return max;
    }
}