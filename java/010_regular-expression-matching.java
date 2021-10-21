class Solution {
    public boolean isMatch(String s, String p) {
        return dfs(s, p);
    }
    
    public boolean dfs(String s, String p) {
        if(s.length() == 0 && p.length() == 0)
            return true;
        if(s.length() > 0 && p.length() == 0)
            return false;
        
        if(p.length() > 1 && p.charAt(1) == '*') {
            boolean answer = false;
            int i = 0;
            if(dfs(s.substring(i), p.substring(2)))
                    answer = true;
            while(i < s.length() && (s.charAt(i) == p.charAt(0) || (p.charAt(0) == '.'))) {
                if(dfs(s.substring(i + 1), p.substring(2)))
                    answer = true;
                i++;
            }
            return answer;
        }
        else {
            if((s.length() > 0) && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
                return dfs(s.substring(1), p.substring(1));
            }
            else 
                return false;
        }
        
    }
}