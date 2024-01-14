class Solution {
    public int maxProfit(int[] prices) {
        // 7 1 5 3 6 4
        //   b
        //           s
        // b > s no good
        // b -> s, s++
        // b < s good
        // s++
        
        // 2 4 5 7 1 3
        //         b
        //         s
        // p 5
        
        int b = 0, s = 0, max = 0;
        while(s < prices.length) {
            if(prices[b] <= prices[s]) {
                int price = prices[s] - prices[b];
                max = Math.max(price, max);
            } else {
                b = s;
            }
            s++;
        }
        return max;
    }
}