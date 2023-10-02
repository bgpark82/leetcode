class Solution {
    public int[] dailyTemperatures(int[] temp) {

        // 73 74 75 71 69 72 76 73
        //    c                        
        // s                        history of indices in ordre
        // 1  1  4  2  1  1
        
        
        // 우리가 원하는 것은 날짜의 차이이다 (날짜 = index)
        // sliding window + stack
        
        int[] ans = new int[temp.length];
        Deque<Integer> stack = new ArrayDeque();
        
        for(int cur = 0; cur < temp.length; cur++) {
            while(!stack.isEmpty() && temp[cur] > temp[stack.peek()]) {
                int prev = stack.removeFirst();
                ans[prev] = cur - prev;
            }
            stack.addFirst(cur);
        }
        
        return ans;
    }

}