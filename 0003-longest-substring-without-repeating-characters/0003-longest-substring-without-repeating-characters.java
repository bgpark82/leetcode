class Solution {
    public int lengthOfLongestSubstring(String s) {
        // ddabcabcd
        //     l
        //       r
        // d 1
        // a 5
        // b 3
        // c 4
        // max 1
        
        // abcabccbb
        //  l
        //    r
        
        // map
        // a 3
        // b 1
        // c 2
        
        // qrsvbspk
        //  l 
        //      r
        
        // set
        // r s v b  
        int max = 0;
        Set<Character> set = new HashSet();
        // abc, bca
        int l = 0, r = 0;
        
        // qrsvbspk
        //    l
        //      r
        // svb
        
        
        while(r < s.length()) {
            // 만약 r 포인터의 문자값이
            // set에 있는 경우
            // l은 r을 찾을 때까지 계속 오른쪽으로 포인터를 이동해야 한다
            if(!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                max = Math.max(max, set.size());
                r++;
            } else {
                // r 포인터의 문자값을 찾을 때까지 l 포인터를 이동하면서 제거
                // l 포인터의 문자값이 r 포인터의 문자값과 일치하면서
                // r 포인터가 다음 루프에서 진행할 수 있다
                set.remove(s.charAt(l));
                l++;
            }
        }
        
        return max;
        
        
        
        
        
        
        
        
//         int max = 0;
//         Set<Character> set = new HashSet();
//         int l = 0, r = 0;
//         while(r < s.length()) {
//             if(set.contains(s.charAt(r))) {
//                 set.remove(s.charAt(l));
//                 l++;
//             } else {
//                 set.add(s.charAt(r));
//                 r++;
//                 max = Math.max(max, set.size());    
//             }
//         }
        
//         return max;
        
        
        
        // substring의 substring을 비교할 수는 없다
        // character 하나하나가 반복이 되었는지 확인해야 한다
//         Map<Character, Integer> map = new HashMap();
//         int max = 0;
//         for(int i = 0; i < s.length(); i++) {
//             for(int j = 0; j < s.length(); j++) {
                
//                 if(map.containsKey(s.charAt(j))) {
//                     i = Math.max(i, map.get(s.charAt(j)) + 1);
//                 }
                
//                 map.put(s.charAt(j), j);
//                 max = Math.max(max, j - i + 1);
//             }
//         }
        
        // return max;
        
//         if(s == null || s.length() == 0) return 0;
        
//         Map<Character, Integer> map = new HashMap();
        
//         int max = 0;
        
//         // 오른쪽 포인터는 계속 1씩 증가, 왼쪽 포인터는 새로운 패턴이 나올 때마다 1씩 증가
//         for(int r = 0, l = 0; r < s.length(); r++) {   
//             // map을 사용한 이유는 중복이 안되어야 하기 때문이다
//             if(map.containsKey(s.charAt(r))) {
//                 l = Math.max(l, map.get(s.charAt(r)) + 1); // map에 중복된 단어가 있으면 중복을 피하기 위해 해시에 저장된 문자의 한칸 오른쪽으로  l 증가
//             }
            
//             // 매번 오른쪽 인덱스의 값을 업데이트, 어짜피 길이만 맞추면 된다.
//             map.put(s.charAt(r), r);
//             max = Math.max(max, r - l + 1);
//         }

//         return max;
        
    }
}