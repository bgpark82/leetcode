class Solution {
    public int lengthOfLastWord(String s) {
        
        // trim 내부 구현??
        // s = s.trim();
        
        int len = s.length();
        int r = len - 1; 
        while(r >= 0 && s.charAt(r) == ' ') r--;
        int l = r;
        while(l >= 0 && s.charAt(l) != ' ') l--; 
        System.out.println(r + " " + l);
        return r - l;
        
        
        // int i = s.length() - 1;
        // for(; i >= 0; i--) {
        //     if(s.charAt(i) == ' ') break;
        // }
        // return s.length() - i - 1;
        // String[] arr = s.trim().split(" ");
        // return arr[arr.length - 1].length();
    }
}