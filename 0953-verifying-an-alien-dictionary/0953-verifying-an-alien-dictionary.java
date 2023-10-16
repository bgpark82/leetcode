class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        //
        
        // hello -> h e l l o
        //          0 6 2 2 
        // leetcode -> l e e t c o d e
        //.            2 6 6
        
        // 순서에 대한 정보를 저장
        // word
        // world
        // row
        if(words == null || words.length == 0) return false;
        if(words.length == 1) return true;
        
        for(int i = 1; i < words.length; i++) {
            String curr = words[i];
            String prev = words[i-1];
            
            if(!check(order, curr, prev)) return false;
        }   
        return true;
    }
    
    private boolean check(String order, String curr, String prev) {
        int clen = curr.length(), plen = prev.length();
        int len = Math.min(plen, clen);
        for(int i = 0; i < len; i++) {
            if(curr.charAt(i) != prev.charAt(i)) {
                return order.indexOf(curr.charAt(i)) > order.indexOf(prev.charAt(i));
            }
        }
        // 같은 경우 clen 길이가 긴 것
        return clen >= plen;
    }
}