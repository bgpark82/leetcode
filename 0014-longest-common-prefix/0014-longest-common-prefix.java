class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // flower, flow, flight
        // flower, flight
        
        if(strs == null || strs.length == 0) return "";
        
        Arrays.sort(strs);
        
        int l = 0, r = strs.length - 1, i = 0;
        
        while(strs[l].length() > i && strs[r].length() > i) {
            if(strs[l].charAt(i) != strs[r].charAt(i)) break;
            i++;
        }
        
        return strs[l].substring(0, i);
    }
}