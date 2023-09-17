class Solution {
    
    List<String> ans = new ArrayList();
    
    public List<String> letterCombinations(String digits) {
        
        // 29
        // 2 : abc
        // 9 : def
        // list에 저장을 순차적으로 할 수 밖에 없다
        // 즉, ad, ae, af를 한꺼번에 할 수 없다 (컴퓨터는 그렇게 동작하지 않는다)
        // 즉, list에 a를 입력한 다음, d,e,f의 조합을 만들어서 다시 넣어줘야 한다
        
        LinkedList<String> ans = new LinkedList();
        if (digits.length() == 0) return ans;
        
        ans.add("");
        
        Map<Character, String> map = new HashMap();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        // ll : "", a b c, 
        
        for(int i = 0; i < digits.length(); i++) {

            // 각 iteration에서 linkedlist의 값의 길이를 확인, 각 iteration에서 자리수가 커진다
            // ""
            // a b c
            // b c ad ae af
            // c ad ae af bd be bf
            // ad ae af bd be bf cd ce cf
            while(ans.peek().length() == i) {
                String s = ans.remove(); // remove head of element

                for(char c : map.get(digits.charAt(i)).toCharArray()) {
                    ans.add(s + c);
                }    
            }
        }
        
        return ans;
    } 
        
        
        
        
        
        
// 		LinkedList<String> ans = new LinkedList<String>();
//         if(digits.isEmpty()) return ans;
		
// 		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
// 		ans.add("");
        
// 		for(int i = 0; i< digits.length(); i++){
// 			int x = Character.getNumericValue(digits.charAt(i));
            
// 			while(ans.peek().length() == i){
// 				String t = ans.remove();
            
// 				for(char s : mapping[x].toCharArray()) {
// 					ans.add(t + s);
//                 }
// 			}
// 		}
// 		return ans;
        
//     }

}

