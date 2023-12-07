class Solution {
    public int singleNumber(int[] nums) {
        // TC : O(n)
        // SC : O(1)
        
        // Bit Manipulation으로 표현하는 방법을 알아야 한다
        // 
        // XOR은 bit의 각 자리수를 비교해서 같으면 0, 다르면 1
        // 4 100
        // 1 001
        // 2 010
        // 1 001
        // 2 010
        // 
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}