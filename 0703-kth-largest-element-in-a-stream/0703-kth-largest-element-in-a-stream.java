class KthLargest {
    
    // kth largest means if there are 3 values in min heap
    // we can find the top value of it
    // so we need to keep heap size 3
    // when add value on heap
    // if there is value in heap which is smaller than input value
    // we can pop it, because we only need 3 largest values in min heap
    // any smaller value than input, needs to be pop
    
    private int k;
    private PriorityQueue<Integer> nums = new PriorityQueue();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int n : nums) add(n); // keep this policy from beginning
    }
    
    public int add(int val) {
        if(this.nums.size() < k) {
            this.nums.add(val);
        } else if (this.nums.peek() < val) {
            // when smaller value needs to be popped
            this.nums.poll();
            this.nums.add(val);    
        }
        
        return this.nums.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */