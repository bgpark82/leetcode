class Solution {
    public int[] twoSum(int[] numbers, int target) { 
        
        // 2, 7, 11, 15
        // l  r
        // 2 + 15 = 17 > 9
        // 2 + 11 = 13 > 9
        // 2 + 7 = 9 == 9
        
        int l = 0, r = numbers.length - 1;
        
        while(l < r) {
            int start = numbers[l];
            int end = numbers[r];
            if(start + end == target) {
                return new int[] {l + 1, r + 1};
            } else if(start + end > target) {
                r--;
            } else {
                l++;
            }
        }
        
        return new int[]{};
    }
}