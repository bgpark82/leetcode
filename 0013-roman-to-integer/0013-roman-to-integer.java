class Solution {
    public int romanToInt(String s) {
        // M     CM XC IV
        // 1000 100 1000 10 100 1 5
        
        int len = s.length();
        
        int sum = 0, curr = 0, prev = 0;
        for(int i = len - 1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'M' : curr = 1000; break;
                case 'D' : curr = 500; break;
                case 'C' : curr = 100; break;
                case 'L' : curr = 50; break;
                case 'X' : curr = 10; break;
                case 'V' : curr = 5; break;
                case 'I' : curr = 1; break;
            }
            if(curr >= prev) sum += curr;
            else sum -= curr;
            
            prev = curr;
        }
        
        
        return sum;
    }
}