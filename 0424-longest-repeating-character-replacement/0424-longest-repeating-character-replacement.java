class Solution {
    public int characterReplacement(String s, int k) {
        // AABABBA
        //   l
        //       r
        // AB
        // 13
        // m 3
        // a 4
        
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         int[] arr = new int[26];
//         int ans = 0, max = 0;
//         for(int r = 0, l = 0; r < s.length(); r++) {
//             // 꾸준히 문자 등장 횟수를 저장한다
//             arr[s.charAt(r) - 'A']++;

//             // l을 증가시킬 조건
//             if (r - l + 1 - findMax(arr) > k) {
//                 arr[s.charAt(l) - 'A']--;
//                 l++;
//             }
            
//             // 꾸준히 최대값을 계산한다
//             ans = Math.max(ans, r - l + 1);
//         }
        
//         return ans;
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