class Solution {
    
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        backtracking(list, "", 0, 0, n);
        
        return list;
    }
        
    
    // well-formed parentheses : 오픈 브라켓과 클로즈 브라켓의 개수가 같을 때??? 
    // 1 0 3 (
    // 2 0 3 ((
    // 3 0 3 (((
    // 3 1 3 ((()
    // 3 2 3 ((())
    // 3 3 3 ((()))
    // 2 1 3 (()
    // 3 1 3 (()( 
    // 2 2 3 (())
    // 3 2 3 (()()
    // 3 2 3 (())(
    // 3 3 3 (())()
    // 3 2 3 (()())
    
    
    private void backtracking(List<String> list, String str, int open, int close, int n) {
        if (open == close && close == n) {
            list.add(str);
            return;
        }
        
        // 오픈 브라켓이 n을 넘어가면 n 쌍을 맞출 수 없다
        if(open < n) {
            backtracking(list, str + "(", open + 1, close, n);
        }
        
        // 클로즈 브라켓이 다음
        if(close < open) {
            backtracking(list, str + ")", open, close + 1, n);
        }   
    }
}