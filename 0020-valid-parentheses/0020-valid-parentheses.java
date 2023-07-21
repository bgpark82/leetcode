class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack(); // O(n)
        Map<Character, Character> map = new HashMap();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        if(s.length() == 1 || s.length() % 2 == 1) return false;
        
        // Time Complexity: O(N)
        // Space Complexity: O(N) 
        for(char c : s.toCharArray()) {
            // just pop if it match
            if(!stack.isEmpty() && map.containsKey(stack.peek()) && map.get(stack.peek()) == c) {
                stack.pop();
            } else {
                // open bracket
                stack.push(c);    
            }
        }
        
        return stack.isEmpty();
    }
}