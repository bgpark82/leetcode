class Solution {
    public String largestNumber(int[] nums) {
        // 3, 30, 34, 5, 9
        
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            
            @Override
            public int compare(String s1, String s2) {
                // n1: 210, n2: 102 = n2 is smaller than n1 = -1
                // n1: 102, n2: 210 = n2 is greater than n1 = 1
                String n1 = s1 + s2, n2 = s2 + s1;
                int result = n2.compareTo(n1);
                System.out.println(n1 + " : " + n2 + " : " + result);
                return result;
                // return s1 - s2;
            }
        });
        
        if(arr[0].startsWith("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String n : arr) {
            sb.append(n);
        }
        
        return sb.toString();
    }
}