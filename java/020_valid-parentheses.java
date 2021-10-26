class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '(':
                    stack.add('(');
                    break;
                case ')':
                    if(stack.size() == 0 || stack.peek() != '(')
                        return false;
                    stack.pop();
                    break;
                case '{':
                    stack.add('{');
                    break;
                case '}':
                    if(stack.size() == 0 || stack.peek() != '{')
                        return false;
                    stack.pop();
                    break;
                case '[':
                    stack.add('[');
                    break;
                case ']':
                    if(stack.size() == 0 || stack.peek() != '[')
                        return false;
                    stack.pop();
                    break;
            }
        }
        if(stack.size() == 0)
            return true;
        else
            return false;
    }
}