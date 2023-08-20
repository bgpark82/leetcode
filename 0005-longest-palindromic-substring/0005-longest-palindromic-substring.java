class Solution {
    public String longestPalindrome(String s) {
        
        String max = "";
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1); // 마지막 인덱스는 제외
                if(isPalindromic(sub)) {
                    if(max.length() < sub.length()) {
                        max = sub;
                    }
                };
            }
        }
       return max;
    }
                   
   private boolean isPalindromic(String str) {
       int l = 0, r = str.length() - 1;
       while(l < r) {
           if(str.charAt(l) != str.charAt(r)) return false;
           l++; r--;
       }
       return true;
   }
                   
}