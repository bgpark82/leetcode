class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // 89n62
        // 0 1 2 3 4 5 6 7 8
        // 0 1 
        // 1, 1, 4, 2, 1, 1
        
        
        int[] ans = new int[temperatures.length];
        Stack<Integer> s = new Stack();
        
        for (int curr = 0; curr < temperatures.length; curr++) {
                
            while (!s.isEmpty() && temperatures[s.peek()] < temperatures[curr]) {
                int prev = s.pop();
                ans[prev] = curr - prev;
            }
            
            s.push(curr);
        }
        
        return ans;
    }

}