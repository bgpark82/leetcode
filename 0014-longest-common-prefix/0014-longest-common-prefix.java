class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // flower, flow, flight
        
        // f 3
        // l 3
        // o 2
        int i = 0;
        String ans = "";
        
        while(i <= 200) {
            if(strs[0].length() <= i) return ans;
            
            char prefix = strs[0].charAt(i);
            
            for(int x = 0; x < strs.length; x++) {

                if(strs[x].length() <= i || prefix != strs[x].charAt(i)) return ans;
            }
            ans += prefix + "";
            i++;
        }
        return ans;
        
    }
}