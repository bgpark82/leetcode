class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 중복된 경우가 있다
        // dvavf
        //   l
        //     r
        // va
        
        Set<Character> set = new HashSet();
        int l = 0, r = 0, max = 0;
        
        while(r < s.length()) {
            if(!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                max = Math.max(max, set.size());
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}