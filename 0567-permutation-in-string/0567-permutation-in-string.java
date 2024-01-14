class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // bfg
        // ehijbfgl
        // 
        // abcdefghijkl
        //  1   11    
        
        // permutation
        // 1. make permutation
        // 2. contained letter
        //
        // sling window는 꼬리를 붙히고 머리를 지워도 가능
        
        int n = s1.length();
        int[] freq = new int[26];
        int m = s2.length();
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int[] freq2 = new int[26];
        for (int i = 0; i < m; i++) {
            freq2[s2.charAt(i) - 'a']++;
            if (i >= n) {
                freq2[s2.charAt(i - n) - 'a']--;
            }
            if (Arrays.equals(freq, freq2))
                return true;
        }
        return false;
    
    }

}