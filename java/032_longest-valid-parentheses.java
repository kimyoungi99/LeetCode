class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        stack.push(-1);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                stack.push(i);
            else {
                stack.pop();
                if(stack.empty()) 
                    stack.push(i);
                else
                    if(answer < i - stack.peek())
                        answer = i - stack.peek();
            }
        }
        
        return answer;
    }
}