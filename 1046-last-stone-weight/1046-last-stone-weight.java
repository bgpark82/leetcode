class Solution {
    public int lastStoneWeight(int[] stones) {
        // choose heaviest 2 stones
        // min heap(2)
        
        // 2 7 4 1 8 1
        // 1 1 2 4 7 8
        // poll 7 8
        // offer 1
        // 1 1 1 2 4
        // poll 2 4
        // offer 2
        // 1 1 1 2
        // poll 1 2
        // offer 1
        // 1 1 1
        // 1
        
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        for(int s : stones) pq.add(s);
        
        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            System.out.println("first=" + first + ", second=" + second);
            
            int result = Math.abs(first - second);
            
            pq.offer(result);
        }
        
        return pq.peek();
    }
}