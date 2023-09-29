class Solution {
    public int maxProfit(int[] prices) {
        // O(n^2) : overtime
        // O(nlogn)
        // O(logn)
        // O(n)
        
        // 7 2 5 1 3 6 4
        //       l
        //             r  
        
        int l = 0, r = 0, max = 0;
        
        // 오른쪽 인덱스의 하한을 설정해야 한다
        // 왜냐하면 r은 계속 늘어날 것이기 때문이다
        while(r < prices.length) {
            if(prices[r] > prices[l]) {
                max = Math.max(max, prices[r] - prices[l]);
                r++;
            } else {
                l = r;
                r++;
            }
        }
                
        return max;
        
        
        
        // 7, 1, 5, 3, 6, 4
        // l  r
        //    l  r          // 가장 오른쪽까지 살필 필요가 없다. 왜냐하면 7, 1이 가장 왼쪽에 있고, 가장 오른쪽에 100이 있다면 100-7보다, 100-1이 더 차이가 크기 때문이다
        
//         int l = 0, r = 1, max = 0;
        
//         while(r < prices.length) {
//             if(prices[l] < prices[r]) { 
//                 // profit, move r to right
//                 max = Math.max(max, prices[r] - prices[l]);
//                 r++;
//             } else {
//                 l = r;
//                 r = r + 1;
//             }
//         }
//         return max;
        
        
        // 이 경우는 계속 r 포인트를 오른쪽으로 무의미하게 옮긴다
        // int max = 0;
        // for(int i = 0; i < prices.length - 1; i++) {
        //     for(int j = i + 1; j < prices.length; j++) {
        //         if(prices[i] < prices[j]) continue;
        //         max = Math.max(max, prices[j] - prices[i]);
        //     }
        // }
        // return max;
    }
}

//100,000 x 100,000 = 10,000,000,000