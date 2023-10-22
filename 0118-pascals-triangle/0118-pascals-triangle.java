class Solution {
    public List<List<Integer>> generate(int numRows) {
        // 1 1       0
        // 2 11      01      0 0
        // 3 121     012     0 01 1
        // 4 1331    0123    0 01 12 2
        // 5 14641   01234   0 01 12 23 3
        
        List<List<Integer>> list = new ArrayList();
        // List<Integer> first = new ArrayList();
        // first.add(1);
        // list.add(first);
        
        List<Integer> prev = null;
        // 1, 2, 3, 4, 5
        for(int size = 1; size <= numRows; size++) {
            // prev= list.get(size-1);
            List<Integer> l = new ArrayList();
            for(int j = 0; j <= size - 1; j++) {
                if(j == 0 || j == size - 1) l.add(1);
                else l.add(list.get(size-2).get(j-1) + list.get(size-2).get(j));
                // int n1 = (j <= 0) ? 0 : prev.get(j - 1);
                // int n2 = (j >= prev.size()) ? 0 : prev.get(j);
                // l.add(n1 + n2);
            }
            list.add(l);
        }
        
        return list;
    }
}