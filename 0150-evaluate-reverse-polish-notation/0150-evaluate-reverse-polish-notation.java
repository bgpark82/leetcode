class Solution {
    public int evalRPN(String[] tokens) {
        // 10 6 9 3 +
        // 10 6 12 -11 *
        // 10 6 -132 /
        // 10 0 *
        // 0 17 + 
        // 17 5 + 
        // 22
        
        Stack<Integer> s = new Stack();
        
        
        for(String token : tokens) {
            // operand
            if(token.equals("+")) {
                s.push(s.pop() + s.pop());
            } else if(token.equals("-")) {
                int first = s.pop();
                int second = s.pop();
                s.push(second - first);
            } else if(token.equals("*")) {
                s.push(s.pop() * s.pop());
            } else if(token.equals("/")) {
                int first = s.pop();
                int second = s.pop();
                s.push(second / first);
            // number
            } else {
                s.push(Integer.parseInt(token));
            }
        }
        
        return s.peek();
        
    }
}