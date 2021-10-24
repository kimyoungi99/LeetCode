class Solution {
    public String longestCommonPrefix(String[] strs) {
        int max = 0;
        for(int i = 0; i < 300; i++) {
            if(!isCharSameAtI(strs, i)) {
                max = i;
                break;
            }
        }
        return strs[0].substring(0, max);
    }
    
    public boolean isCharSameAtI(String[] strs, int index) {
        char c = ' ';
        if(index < strs[0].length() )
            c = strs[0].charAt(index);
        else
            return false;
        for(String str : strs) {
            if( str.length() <= index || str.charAt(index) != c)
                return false;
        }
        return true;
    }
}