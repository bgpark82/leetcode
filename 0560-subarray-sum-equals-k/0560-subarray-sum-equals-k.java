class Solution {
    public int subarraySum(int[] nums, int k) {
        // brute force 방식은 O(n^2)
        // O(n)으로 만들기 위해서는 two pointer나 sliding window를 사용한다
        // sliding window의 경우, nums = [1 1 1], k = 2일 때
        // 1 1이면 답이지만 1 1 1이면 2보다 크므로 가장 왼쪽의 포인터를 오른쪽으로 옮겨야 한다
        // 1 1 1의 경우 포인터를 옮기면 1 1이지만, -1 1 1 1의 경우 포인터를 오른쪽으로 옮기면 1 1 1이므로 여전히 3이된다
        // 즉, sliding window는 window의 크기가 일정하게 변한다는 것을 보장할 때 사용할 수 있다
        // 즉, 값 중에 음수가 있으면 거의 사용못한다 보면된다 (그래도 사용해본다!)
        
        // O(n^2)을 O(n)으로 바꾸는 방법은 SC를 O(n)으로 증가시키는 것이다
        // 그렇다면 무엇을 저장할 것인가??
        // 1 1 1 -1 1 k=3
        // 각 포인터 이전에 subarray의 합의 결과가 몇개가 있는지 알면된다
        //     3
        // m = [0:1, 1:1, 2:1]
        // 인덱스가 2인 지점을 보면 이전 subarray는 1 11이 존재한다
        // 즉, 합이 1과 2인 subarray가 존재한다는 뜻이다.
        // 인덱스가 2라면 총 subarray의 합은 3이 된다
        // 이는 k값과 똑같다. 즉, 1 1 1이 subarray가 되고 이전 subarray는 []이므로 [0:1] 값을 사용하게 된다
        // 1 1 1 -1 1 k=3
        //          3
        // m = [0:2, 1:1, 2:2]
        // 인덱스가 4인 지점을 보면 이전 subarray들의 합들은 0이 1번, 3이 1번, 1이 1번, 2가 2번 나온다
        // 우리의 목표는 3이 몇번 나오는지 알면된다
        // 1 1 1 -1 1 1 1 1 k=3
        // map=[0:1, 1:1, 2:2, 3:2]
        
        if(nums == null || nums.length == 0) return 0;
        
        Map<Integer, Integer> subSumMap = new HashMap();
        subSumMap.put(0, 1);
        
        int sum = 0, ans = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int diff = sum - k;
            if(subSumMap.containsKey(diff)) {
                ans += subSumMap.get(diff);
            }
            subSumMap.put(sum, subSumMap.getOrDefault(sum, 0) + 1);
        }
        return ans;
        
        
        // int count = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i; j < nums.length; j++) {
        //         int sum = 0;
        //         for(int x = i; x <= j; x++) {
        //             sum += nums[x];
        //         }
        //         if(sum == k) count++;
        //     }
        // }
        // return count;
    }
}