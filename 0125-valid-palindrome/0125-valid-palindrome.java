class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        
        // .,
        // lr
        while(l < r) {            
            char start = s.charAt(l);
            char end = s.charAt(r);
             
            if(l < s.length() && isValid(start)) {
                l++;
                continue;
            }
            if(r >= 0 && isValid(end)) {
                r--;
                continue;
            }
            if(l >= s.length() || r < 0) continue;
            
            if(Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            l++; r--;
            
        }
        
        return true;
    }
    
    private boolean isValid(char c) {
        return Character.isWhitespace(c) || !Character.isLetterOrDigit(c);
    }
}