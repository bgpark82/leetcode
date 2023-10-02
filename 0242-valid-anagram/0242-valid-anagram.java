class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] tmp = new int[27];
        for(int i = 0; i < s.length(); i++) {
            tmp[s.charAt(i) - 'a']++;
            tmp[t.charAt(i) - 'a']--;
        }
        for(int n : tmp) {
            if(n > 0) return false;
        }
        return true;
    }
}