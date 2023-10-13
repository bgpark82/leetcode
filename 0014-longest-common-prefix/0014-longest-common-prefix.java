class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // flower, flow, flight
        // flower, flight
        // fl      fl
        
        if(strs == null || strs.length == 0) return "";
        
        Arrays.sort(strs);
        
        String l = strs[0], r = strs[strs.length - 1];
        int i = 0;
        
        while(l.length() > i && r.length() > i) {
            if(l.charAt(i) != r.charAt(i)) break;
            i++;
        }
        
        return l.substring(0, i);
    }
}