class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<String>();
        if(digits.length() == 0)
            return answer;
        dfs(answer, digits, "");
        return answer;
    }
    
    public void dfs(List<String> answer, String digits, String cur) {
        String[] mapping = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(cur.length() == digits.length()) {
            answer.add(cur);
            return;
        }
        
        for(int i = 0; i < mapping[digits.charAt(cur.length()) - '0' - 2].length(); i++)
            dfs(answer, digits, cur + mapping[digits.charAt(cur.length()) - '0' - 2].charAt(i));
        return;
    }
}