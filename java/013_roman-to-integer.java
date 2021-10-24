class Solution {
    public int romanToInt(String s) {
        String[] tokens = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int answer = 0;
        
        for(int i = 0 ; i < tokens.length; i++) {
            if(s.length() == 0)
                break;
            while(matchToken(s, tokens[i])) {
                answer += values[i];
                s = s.substring(tokens[i].length());
            }
        }
        
        return answer;
    }
    
    public boolean matchToken(String s, String token) {
        if(token.length() > s.length())
            return false;
        
        for(int i = 0; i < token.length(); i++) {
            if(token.charAt(i) != s.charAt(i))
                return false;
        }
        return true;
    }
}