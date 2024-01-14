class Solution {
    public int characterReplacement(String s, int k) {
        
        // k = 2
        // AABABBA
        // l
        //     r
        //
        // max = 3
        // AB
        // 33
        int[] arr = new int[26];
        int max = 0, ans = 0;
        
        // shrink sliding window (길이의 관점에서 봐야되는구나, sliding window가 window 길이이기 때문에)
        for(int l = 0, r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            max = Math.max(max, arr[s.charAt(r) - 'A']);
            
            // 현재 윈도우에서 가장 큰 값을 제외한 값이 k보다 크면 l포인터를 이동 (shrink)
            while(r - l + 1 - max > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            
            ans = Math.max(ans, r - l + 1);
        }
        return ans;

    }
}