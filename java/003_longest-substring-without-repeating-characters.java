class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, cur = 0, start = 0, end = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(end < s.length()) {
            if(map.get(s.charAt(end)) == null) {
                cur += 1;
                map.put(s.charAt(end), 0);
                end += 1;
            }
            else {
                cur -= 1;
                map.remove(s.charAt(start));
                start += 1;
            }
            if(max < cur)
                max = cur;
        }
        return max;
    }
}