class Solution {
    public int maxArea(int[] height) {
        // 1 8 6 2 5 4 8 3 7
        //   l             r
        // min(1,7) = 1 * (r-l) = 8 -> l++
        // min(8,7) = 8 * (r-l) = 56 ->
        
        int l = 0, r = height.length - 1;
        int max = 0;
        while(l < r) {
            int water = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(water, max);
            if(height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        
        return max;
    }
}