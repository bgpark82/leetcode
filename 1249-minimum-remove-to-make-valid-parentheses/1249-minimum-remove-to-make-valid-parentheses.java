class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Pair> stack = new Stack();
        StringBuilder sb = new StringBuilder(s);
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(') stack.push(new Pair(c, i));
                else if(c == ')') {
                if(!stack.isEmpty() && stack.peek().key == '(') stack.pop();
                else stack.push(new Pair(c, i));
            } 
        }
        
        while(!stack.isEmpty()) {
            sb.deleteCharAt(stack.pop().index);
        }
        
        return sb.toString();       
    }
    
    class Pair {
        char key;
        int index;
        
        public Pair(char key, int index) {
            this.key = key;
            this.index = index;
        }
    }
}