class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
            if(map.get(word) !=null)
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }

        for(int i = 0; i < s.length(); i++)
            if(checkIndex(new HashMap<String, Integer>(map), s, i, words[0].length(), words.length))
                answer.add(i);

        return answer;
    }

    public boolean checkIndex(Map<String, Integer> map, String s, int index, int wordSize, int wordsLength) {
        if(index + wordSize * wordsLength > s.length())
            return false;

        for(int i = index; i <= index + (wordsLength - 1) * wordSize; i += wordSize) {
            if(map.get(s.substring(i, i + wordSize)) == null || map.get(s.substring(i, i + wordSize)) <= 0)
                return false;
            map.replace(s.substring(i, i + wordSize), map.get(s.substring(i, i + wordSize)) - 1);
        }
        return true;
    }
}