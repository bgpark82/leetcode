class Solution {
    
    List<String> ans = new ArrayList();
    
    public List<String> letterCombinations(String digits) {
        
        
		LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
		
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
        
        // 2, 3
		for(int i = 0; i< digits.length(); i++){
			int x = Character.getNumericValue(digits.charAt(i));
            
            // 자리수 별로
            // 
            // a b c
            // c -> cd, ce, af
			while(ans.peek().length() == i){
				String t = ans.remove();
                System.out.println("t=" + t);
                
                // a, b, c
                // ad, ae, af
				for(char s : mapping[x].toCharArray()) {
                    String temp = t + s;
                    System.out.println(temp);
					ans.add(temp);
                    }
			}
		}
		return ans;
        
    }

}

