class Solution {
    public int search(int[] nums, int target) {
        
        // binary search는 binary search tree와 다르다. 
        // 정렬된 경우 사용가능
        
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            // l +  (r - l) / 2 is better! (https://www.youtube.com/watch?v=JNFGvjATOUA&ab_channel=PortfolioCourses)
            // if r == Integer.MAX_VALUE, l = Integer.MAX_VALUE 인 경우는 overflow 발생
            int mid = l + (r - l) / 2;
            if(nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                l = mid + 1;
                continue;
            } else {
                r = mid - 1;
                continue;
            }
        }
        return -1;
    }
}