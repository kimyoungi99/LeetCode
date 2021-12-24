class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        int[][] curKey = new int[key.length][key.length];
        for(int i = 0; i < key.length; i++) {
            for(int j = 0; j < key.length; j++) {
                curKey[i][j] = key[i][j];
            }
        }
        int[][] curLock = expandLock(lock, key.length);
        for(int q = 0; q < 4; q++) {
            curKey = rotate(curKey);
            for(int i = 0; i < key.length + lock.length + 1; i++) {
                for(int j = 0; j < key.length + lock.length + 1; j++) {
                    if(unlocked(curLock, curKey, i, j))
                        return true;
                }
            }
        }
        return false;
    }
    
    public int[][] rotate(int[][] key) {
        int[][] ans = new int[key.length][key.length];
        
        for(int i = 0; i < key.length; i++) {
            for(int j = 0; j < key.length; j++) {
                ans[i][j] = key[j][key.length - 1 - i];
            }
        }
        return ans;
    }
    
    public int[][] expandLock(int[][] lock, int keyLength) {
        int[][] ans = new int[lock.length + keyLength * 2][lock.length + keyLength * 2];
        for(int i = keyLength; i < lock.length + keyLength; i++) {
            for(int j = keyLength; j < lock.length + keyLength; j++) {
                ans[i][j] = lock[i - keyLength][j - keyLength];
            }
        }
        return ans;
    }
    
    public boolean unlocked(int[][] temp, int[][] key, int offsetI, int offsetJ) {
        int[][] lock = new int[temp.length][temp.length];
        for(int i = 0; i < temp.length; i++) {
            for(int j = 0; j < temp.length; j++) {
                lock[i][j] = temp[i][j];
            }
        }
        for(int i = 0; i < key.length; i++) {
            for(int j = 0; j < key.length; j++) {
                if(lock[i + offsetI][j + offsetJ] == 1 && key[i][j] == 1)
                    return false;
                if(key[i][j] == 1)
                    lock[i + offsetI][j + offsetJ] = 1;
            }
        }
        for(int i = key.length; i < lock.length - key.length; i++) {
            for(int j = key.length; j < lock.length - key.length; j++) {
                if(lock[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}