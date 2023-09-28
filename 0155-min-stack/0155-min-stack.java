class MinStack {
    
    // p -2
    // p 0
    // p -3
    
    // p 1
    // p 3
    // p 2
    
    // stack : 2 3 1
    // min : 1
    
    // 0 -2 -3
    //
    
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayDeque();
        this.minStack = new ArrayDeque();
    }
    
    public void push(int val) {
        stack.addFirst(val);

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