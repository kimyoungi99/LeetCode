import java.util.*;

class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        int startTimes[] = new int[lines.length];
        int endTimes[] = new int[lines.length];
        for(int i = 0; i < lines.length; i++) {
            String[] ss = lines[i].split(" ")[1].split(":");
            endTimes[i] = Integer.parseInt(ss[0]) * 60 * 60 * 1000 + Integer.parseInt(ss[1]) * 60 * 1000 + Integer.parseInt(ss[2].split("\\.")[0]) * 1000 + Integer.parseInt(ss[2].split("\\.")[1]);
            String dur = lines[i].split(" ")[2].substring(0, lines[i].split(" ")[2].length() - 1);
            int temp = 0;
            if(dur.contains("."))
                temp = Integer.parseInt(dur.split("\\.")[0]) * 1000 + Integer.parseInt(dur.split("\\.")[1]);
            else
                temp = Integer.parseInt(dur) * 1000;
            
            
            startTimes[i] = endTimes[i] - temp + 1;
            System.out.println(startTimes[i] + " " + endTimes[i]);
        }
        
        for(int i = 0; i < startTimes.length; i++) {
            int cnt = 0;
            for(int j = 0; j < startTimes.length; j++) {
                if(check(startTimes[i], startTimes[i] + 999, startTimes[j], endTimes[j]))
                    cnt++;
            }
            if(cnt > answer)
                answer = cnt;
            cnt = 0;
            for(int j = 0; j < startTimes.length; j++) {
                if(check(startTimes[i] - 999, startTimes[i], startTimes[j], endTimes[j]))
                    cnt++;
            }
            if(cnt > answer)
                answer = cnt;
        }
        
        for(int i = 0; i < endTimes.length; i++) {
            int cnt = 0;
            for(int j = 0; j < endTimes.length; j++) {
                if(check(endTimes[i], endTimes[i] + 999, startTimes[j], endTimes[j]))
                    cnt++;
            }
            if(cnt > answer)
                answer = cnt;
            cnt = 0;
            for(int j = 0; j < endTimes.length; j++) {
                if(check(endTimes[i] - 999, endTimes[i], startTimes[j], endTimes[j]))
                    cnt++;
            }
            if(cnt > answer)
                answer = cnt;
        }
        
        return answer;
    }
    
    public boolean check(int start, int end, int checkStart, int checkEnd) {
        if(start > checkEnd || checkStart > end)
            return false;
        return true;
    }
}