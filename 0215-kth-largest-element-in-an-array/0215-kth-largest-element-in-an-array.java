class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 1 2 3 4 5 6
        // 
        
        PriorityQueue<Integer> max = new PriorityQueue(Collections.reverseOrder()); // max heap
        
        // nlogn
        for(int n : nums) max.offer(n);
        
        int result = 0;
        while(k > 0) {
            --k;
            result = max.poll();
        }
        
        return result;
    }
}