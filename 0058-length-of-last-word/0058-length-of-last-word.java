class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        
        int i = s.length() - 1;
        for(; i >= 0; i--) {
            if(s.charAt(i) == ' ') break;
        }
        return s.length() - i - 1;
        // String[] arr = s.trim().split(" ");
        // return arr[arr.length - 1].length();
    }
}