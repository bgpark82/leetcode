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
            // 68.75 60.59

            // l을 증가시킬 조건
            if (r - l + 1 - findMax(arr) > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            
            // 꾸준히 최대값을 계산한다
            ans = Math.max(ans, r - l + 1);
        }
        
        return ans;
    }
    
    // window 내에서 가장 많은 개수를 가진 캐릭터의 개수
    private int findMax(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}