class Solution {
    public boolean canCross(int[] stones) {
        
        Map<Integer, Set<Integer>> map = new HashMap();
        for(int s : stones)  {
            map.put(s, new HashSet());
        }
        
        map.get(stones[0]).add(0);
        
        for(int s : stones) {
            // https://m.blog.naver.com/tmondev/220393974518
            for(int m : map.get(s)) {
                for(int i = m - 1; i <= m + 1; i++) {
                    if(i != 0 && map.containsKey(s + i)) {
                        if(s + i == stones[stones.length - 1]) return true;
                        map.get(s + i).add(i);
                    }
                }
            }
        }
        return false;
    }

    
    // dp 이전 결과에 따라 다음 결과가 정해짐

}