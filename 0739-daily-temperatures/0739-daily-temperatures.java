class Solution {
    public int[] dailyTemperatures(int[] temp) {

        // 73,74,75,71,69,72,76,73
        // 0 1 2 3 4 5 6 7 8
        // curr : 7
        // s : 6 7
        //     
        // a : 1, 1, 4, 2, 1, 1
        
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