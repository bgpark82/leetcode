class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        
        // .,
        // lr
        while(l < r) {            
             
            while(l < s.length() && isValid(s.charAt(l))) {
                l++;
            }
            while(r >= 0 && isValid(s.charAt(r))) {
                r--;
            }
            if(l >= s.length() || r < 0) continue;
            
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
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