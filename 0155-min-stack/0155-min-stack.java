class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayDeque();
        this.minStack = new ArrayDeque();
    }
    
    public void push(int val) {
        stack.addFirst(val);

        // 무조건 작은 값만 쌓아 올린다 (min stack의 순서는 중요하지 않다)
        int min = Math.min(val, minStack.size() == 0 ? val : minStack.peek());
        minStack.addFirst(min);
    }
    
    public void pop() {
        stack.removeFirst();
        minStack.removeFirst();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */