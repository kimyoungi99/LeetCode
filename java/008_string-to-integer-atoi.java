class Solution {
    public int myAtoi(String s) {
        int answer = 0;
        boolean sign = true; // true for positive
        // 1번
        while(s.length() > 0 && s.charAt(0) == ' ')
            s = s.substring(1);
        
        // 2번
        if(s.length() != 0 && (s.charAt(0) == '+' || s.charAt(0) == '-')) {
            if(s.charAt(0) == '-')
                sign = false;
            s = s.substring(1);
        }
        
        // 3번
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) < '0'  || s.charAt(i) > '9') {
                s = s.substring(0, i);
                break;
            }
        
        // 4번
        s = deleteZeros(s);
        answer = StrToInt(s);
        
        // 5번 & 6번
        if(checkOverflow(s, sign)) {
            if(sign)
                return 2147483647;
            else
                return -2147483648;
        }  
        if(!sign)
            answer *= -1;
        return answer;
    }
    
    public boolean checkOverflow(String s, boolean sign) {
        if(s.length() > 10)
            return true;
        else if(s.length() < 10)
            return false;
        String bound = "2147483647";
        if(!sign)
            bound = "2147483648";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > bound.charAt(i))
                return true;
            else if(s.charAt(i) < bound.charAt(i))
                return false;
        }
        return false;    
    }
    
    public String deleteZeros(String s) {
        // remove all 0's at the beginning of string
        while(s.length() > 0 && s.charAt(0) == '0')
            s = s.substring(1);
        return s;
    }
    
    public int StrToInt(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            answer *= 10;
            answer += s.charAt(i) - '0';
        }
        
        return answer;
    }
}