class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // ab
        // eidbaooo
        
        // permutation
        // 1. make permutation
        // 2. contained letter
    
        // a 1
        // b 1
        
        // eidbaooo
        //    i
        
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