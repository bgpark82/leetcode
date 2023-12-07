class Solution {
    public int singleNumber(int[] nums) {
        // TC : O(n)
        // SC : O(1)
        
        Map<Integer, Integer> map = new HashMap();
        
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) return entry.getKey();
        }
        return -1;
    }
}