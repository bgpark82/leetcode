class Solution {
    public int romanToInt(String s) {
        // M     CM XC IV
        
        // 1000 100 1000 10 100 1 5
        
        int len = s.length();
        
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
        int prev = map.get(s.charAt(len-1));
        int sum = prev;
        for(int i = len - 2; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            
            if(prev > curr) sum -= curr;
            else sum += curr;
            
            prev = curr;
        }
        
        return sum;
    }
}