class Solution {
    public String solution(int n) {
        return convertTo124(n);
    }

    public String convertTo124(int n) {
        String answer = "";
        String[] map = {"4", "1", "2"};
        while(n > 0) {
            answer = map[n % 3] + answer;
            if(n % 3 == 0)
                n--;
            n /= 3;
        }
        return answer;
    }
}