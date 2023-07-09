class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // SC : O(n)
        // TC : O(n^2 * log(n))
        Map<String, List<String>> map = new HashMap();

        for (String str : strs) {
            // nat
            // 문자 정렬의 시간복잡도(O(nlogn))을 공간 복잡도(O(n))와 시간복잡도(O(n))으로 치환가능
            int[] hash = new int[26];
            for(char c : str.toCharArray()) {
                hash[c - 'a']++;
            }
            String nc = Arrays.toString(hash);
            // ant
            map.putIfAbsent(nc, new ArrayList());
            map.get(nc).add(str);
        }

        List<List<String>> ans = new ArrayList();
        ans.addAll(map.values());

        return ans;
    }
}