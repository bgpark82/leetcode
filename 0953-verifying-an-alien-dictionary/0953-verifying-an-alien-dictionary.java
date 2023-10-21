class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        // a b c d e f ..
        // 2 3 4 5
        
        // prev : leet
        //           0
        // curr : leetcode
        //           1
        //
        // hell o
        // 0622 14
        // leet code
        // 166195
        
        int[] map = new int[26];
        for(int i = 0; i < 26; i++) {
            map[order.charAt(i) - 'a'] = i;
        }
        
        
        for(int i = 1; i < words.length; i++) {
            String prev = words[i-1];        
            String curr = words[i];        
            
            // for(int j = 0; j < len; j++) {
            //     if(map[prev.charAt(j) - 'a'] < map[curr.charAt(j) - 'a']) break;
            //     if(map[prev.charAt(j) - 'a'] > map[curr.charAt(j) - 'a']) return false;
            // }
            
            if(!check(map, prev, curr)) return false;
        }
        
        return true;
    }
    
    private boolean check(int[] map, String prev, String curr) {
        int len = Math.min(prev.length(), curr.length());
        for(int j = 0; j < len; j++) {
            if(map[prev.charAt(j) - 'a'] < map[curr.charAt(j) - 'a']) return true;
            if(map[prev.charAt(j) - 'a'] > map[curr.charAt(j) - 'a']) return false;
        }
        return prev.length() <= curr.length();
    }
    
}