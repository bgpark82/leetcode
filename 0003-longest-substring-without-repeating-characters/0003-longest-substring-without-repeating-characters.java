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
        
        if(s == null || s.length() == 0) return 0;
        
        Map<Character, Integer> map = new HashMap();
        
        int max = 0;
        
        // 오른쪽 포인터는 계속 1씩 증가, 왼쪽 포인터는 새로운 패턴이 나올 때마다 1씩 증가
        for(int r = 0, l = 0; r < s.length(); r++) {   
            // map을 사용한 이유는 중복이 안되어야 하기 때문이다
            if(map.containsKey(s.charAt(r))) {
                l = Math.max(l, map.get(s.charAt(r)) + 1); // map에 중복된 단어가 있으면 중복을 피하기 위해 해시에 저장된 문자의 한칸 오른쪽으로  l 증가
            }
            
            // 매번 오른쪽 인덱스의 값을 업데이트
            map.put(s.charAt(r), r);
            max = Math.max(max, r - l + 1);
        }
        
//         // edge case
//         if (s.length()==0) return 0;
        
//         // sliding window에서는 저장된 값을 통해 정답을 판별한다
//         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
//         int max=0;
//         // i와 j는 그냥 포인터일 뿐
//         for (int i=0, j=0; i<s.length(); ++i){
            
//             System.out.println("i=" + i + ", j=" + j);
//             // i = l, j = r;
//             for(Map.Entry e : map.entrySet()) {
//                 System.out.println("key=" + e.getKey() + ", value=" + e.getValue());
//             }
            
//             // condition
//             if (map.containsKey(s.charAt(i))){
//                 // update j
//                 j = Math.max(j, map.get(s.charAt(i)) + 1); // 같은 문자가 나왔을 때 j를 예전 문자의 인덱스에서 오른쪽으로 한칸씩 이동
//             }
//             map.put(s.charAt(i), i);
            
//             // 결과
//             max = Math.max(max,i-j+1);
//         }
        return max;
        
    }
}