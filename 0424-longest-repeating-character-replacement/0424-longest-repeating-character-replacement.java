class Solution {
    public int characterReplacement(String s, int k) {
        // k = 1
        // AABABBA
        //  l
        //      r
        // A 2
        // B 3 
        // 
        // max = 3
        // ans = 4 
        
        int[] arr = new int[26];
        int ans = 0, max = 0;
        for(int r = 0, l = 0; r < s.length(); r++) {
            // 꾸준히 문자 등장 횟수를 저장한다
            arr[s.charAt(r) - 'A']++;
            
            
            max = Math.max(max, arr[s.charAt(r) - 'A']); // max: window 안에서 최대 맥스값, 실제로 문자를 바꿀 필요없이, 바꿔야 할 문자의 개수를 저장하면 된다 
            // l을 증가시킬 조건
            if (r - l + 1 - max > k) { // r-l+1 : 현재 윈도우, r-l+1-max : 현재 window에서 
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            
            // 꾸준히 최대값을 계산한다
            ans = Math.max(ans, r - l + 1);
        }
        
        return ans;
    }
    
    private int findMax(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}