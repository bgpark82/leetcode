class Solution {
    public int lastStoneWeight(int[] stones) {

        // 2 7 4 1 8 1
        // 8 7 4 2 1 1
        // 4 2 1 1 1
        // 2 1 1 1
        // 1 1 1
        // 1
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        for(int s: stones) pq.add(s);
        
        while(pq.size() >= 2) {
            int x = pq.poll();
            int y = pq.poll();
            
            int result = Math.abs(x - y);
            
            pq.offer(result);
        }
        
        return pq.poll();
    }
}