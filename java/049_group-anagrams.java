class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();
      for(String s : strs) {
          String key = makeHash(s);
          if(map.get(key) == null) {
              map.put(key, new ArrayList<String>());
          }
          map.get(key).add(s);
      }
      return new ArrayList<>(map.values());
  }
  
  private String makeHash(String s) {
      int[] cnt = new int[26];
      String ans = "";
      for(int i = 0 ; i < s.length(); i++) {
          cnt[s.charAt(i) - 'a']++;
      }
      for(int i = 0; i < 26; i++) {
          ans += (char) ('a' + i);
          ans += cnt[i];
          }
      
      return ans;
  }
}