class Solution {
    public int[] replaceElements(int[] arr) {
        
        // 17 18 5 4 6 1
        //         4 6 -1 
        //           
  
        int max = -1;
        for(int i = arr.length - 1; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = max;
            max = Math.max(tmp, max);
        }        
        return arr;
        
//         Deque<Integer> stack = new ArrayDeque();
        
//         for(int i = 0; i < arr.length; i++) {
//             while(!stack.isEmpty() && stack.peek() < arr[i]) {
//                 int index = stack.removeFirst();    
//                 arr[index] = arr[i];
//             }
//             stack.addFirst(i);
//         }
    }
}