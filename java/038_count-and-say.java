class Solution {
    public String countAndSay(int n) {
        String answer = "1";
        for(int i = 0; i < n - 1; i++)
            answer = recursive(answer);
        return answer;
    }
    
    public String recursive(String n) {
        String answer = "";
        Character temp = '-', cnt = 0;
        
        for(int i = 0; i < n.length(); i++) {
            if(n.charAt(i) != temp) {
                if(temp != '-')
                    answer += Integer.toString(cnt) + temp;
                cnt = 1;
                temp = n.charAt(i);
            }
            else
                cnt++;
        }
        answer += Integer.toString(cnt) + temp;
        return answer;
    }
}