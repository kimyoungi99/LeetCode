class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answers = new ArrayList<>();
        dfs("", n, 0, n, answers);
        return answers;
    }
    
    public void dfs(String parentheses, int remainingLeft, int openedLeft, int n, List<String> answers) {
        if(parentheses.length() == n * 2) {
            answers.add(parentheses);
        }
        if(openedLeft > 0)
            dfs(parentheses + ")", remainingLeft, openedLeft - 1, n, answers);
        if(remainingLeft > 0) {
            dfs(parentheses + "(", remainingLeft - 1, openedLeft + 1, n, answers);
        }
        return;
    }
}