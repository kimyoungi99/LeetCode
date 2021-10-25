class Solution {
    public long solution(int w, int h) {
        return ((long) w) * ((long) h) - gcd(w,h) * (((long) w) / gcd(w,h) + ((long) h) / gcd(w,h) - 1);
    }
    
    public long gcd(long num1, long num2) {
        if(num2 == 0) 
            return num1;
        else 
            return gcd(num2, num1 % num2);
    }
}