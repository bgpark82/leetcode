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
        
        for(int l = 0, r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            // 현재 포인트에서 가장 최대의 값 (A 혹은 B 일수도 있다 계속 변한다)
            max = Math.max(max, arr[s.charAt(r) - 'A']);
            
            // 현재 윈도우에서 가장 적게 나오는 값을 찾는다 (A 혹은 B 일수도 있다 계속 변한다)
            while((r - l + 1) - max > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }            
            ans = Math.max(ans, r - l + 1);
        }
        return ans;

    }
}