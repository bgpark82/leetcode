class Solution {
    public int[] dailyTemperatures(int[] temp) {

        // 73 74 75 71 69 72 76 73
        //    c
        // s
        // 1
        
        int[] ans = new int[temp.length];
        Stack<Integer> s = new Stack();
        
        for(int curr = 0; curr < temp.length; curr++) {
            
            while(!s.isEmpty() && temp[curr] > temp[s.peek()]) {
                int prev = s.pop();
                ans[prev] = curr - prev;
            }
            
            s.push(curr);
        }
        
        return ans;
    }

}