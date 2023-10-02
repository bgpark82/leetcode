class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // SC : O(n)
        // TC : O(n^2 * log(n))
        Map<String, List<String>> map = new HashMap();
        
        for(String str : strs) {
            
            int[] hash = new int[26];
            for(char c : str.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = Arrays.toString(hash);
            
            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(str);
        }
        
        List<List<String>> ans = new ArrayList();
        ans.addAll(map.values());
        
        return ans;
    }
}