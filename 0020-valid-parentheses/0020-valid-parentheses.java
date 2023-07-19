class Solution {
    public boolean isValid(String s) {
        
        ArrayDeque<Character> stack = new ArrayDeque();
        Map<Character, Character> map = new HashMap();
        map.put('[', ']');
        map.put('(', ')');
        map.put('{', '}');
        
        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && map.containsKey(stack.peek()) && map.get(stack.peek()) == c) {
                stack.pop();
            } else {
                stack.push(c);    
            }
        }   

        return stack.isEmpty();
    }
}