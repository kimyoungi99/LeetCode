import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0, intersection = 0, union = 0;
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();

        for(int i = 0; i < str1.length() - 1; i++) {
            String temp = convertEliment(str1.substring(i, i + 2));
            if(temp.length() == 2) {
                if(mapA.get(temp) == null)
                    mapA.put(temp, 1);
                else
                    mapA.put(temp, mapA.get(temp) + 1);
            }
        }

        for(int i = 0; i < str2.length() - 1; i++) {
            String temp = convertEliment(str2.substring(i, i + 2));
            if(temp.length() == 2) {
                if(mapB.get(temp) == null)
                    mapB.put(temp, 1);
                else
                    mapB.put(temp, mapB.get(temp) + 1);
            }
        }
        if(mapA.size() == 0 && mapB.size() == 0)
            return 65536;

        for(Map.Entry<String, Integer> e : mapA.entrySet()) {
            if(mapB.get(e.getKey()) != null) {
                intersection += min(e.getValue(), mapB.get(e.getKey()));
                union += max(e.getValue(), mapB.get(e.getKey()));
            }
            else {
                union += e.getValue();
            }
            mapB.remove(e.getKey());
        }

        for(Map.Entry<String, Integer> e : mapB.entrySet()) {
            union += e.getValue();
        }

        return (int) (((double) intersection / union) * 65536);
    }

    public String convertEliment(String twoChar) {
        String answer = "";
        if(twoChar.length() != 2)
            return "";
        for(int i = 0; i < 2; i++) {
            if((twoChar.charAt(i) <= 'z' && twoChar.charAt(i) >= 'a'))
                answer += Character.toString(twoChar.charAt(i));
            else if((twoChar.charAt(i) <= 'Z' && twoChar.charAt(i) >= 'A'))
                answer += Character.toString(twoChar.charAt(i) + ('a' - 'A'));
            else
                return "";
        }
        return answer;
    }

    public int max(int a, int b) {
        if(a > b)
            return a;
        return b;
    }

    public int min(int a, int b) {
        if(a < b)
            return a;
        return b;
    }
}