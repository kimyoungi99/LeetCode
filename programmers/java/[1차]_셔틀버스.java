import java.util.*;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        LinkedList<Integer> minTable = new LinkedList<Integer>();
        int answerMin = 0;
        for(String time : timetable) {
            minTable.add(timeToMin(time));
        }
        Collections.sort(minTable);

        // 브루트 포스
        for(int i = 0; i <= 1440; i++) {
            int index = findIndex(i, minTable);
            minTable.add(index, i);
            if(isCommutable(n, t, m, index, minTable))
                answerMin = i;
            else
                break;
            minTable.remove(index);
        }

        return minToTime(answerMin);
    }

    public boolean isCommutable(int n, int t, int m, int index, LinkedList<Integer> minTable) {
        int commuted = 0, curTime = 540;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(minTable.get(commuted) <= curTime)
                    commuted++;
                else
                    break;
            }
            curTime += t;
        }
        return commuted > index;
    }

    public int findIndex(int min, LinkedList<Integer> minTable) {
        for(int i = 0; i < minTable.size(); i++) {
            if(minTable.get(i) > min)
                return i;
        }
        return minTable.size();
    }

    public int timeToMin(String time) {
        return (time.charAt(0) - '0') * 600 + (time.charAt(1) - '0') * 60 + (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
    }

    public String minToTime(int min) {
        String answer = "";
        // 시
        answer += ((char) min / 600);
        min %= 600;
        answer += ((char) min / 60);
        min %= 60;

        answer += ":";
        // 분
        answer += (char) min / 10;
        answer += (char) min % 10;
        return answer;
    }
}