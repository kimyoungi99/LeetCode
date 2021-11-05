class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++)
            if(!checkRow(board, i))
                return false;
        for(int i = 0; i < board.length; i++)
            if(!checkColumn(board, i))
                return false;
        for(int i = 0; i < board.length; i++)
            if(!checkCube(board, i))
                return false;
        return true;
    }
    
    public boolean checkRow(char[][] board, int i) {
        boolean[] boolAry = new boolean[board[0].length];
        for(int j = 0; j < board[0].length; j++) {
            if(board[i][j] == '.')
                continue;
            else if(!boolAry[board[i][j] - '0' - 1])
                boolAry[board[i][j] - '0' - 1] = true;
            else
                return false;
        }
        return true;
    }
    
    public boolean checkColumn(char[][] board, int j) {
        boolean[] boolAry = new boolean[board.length];
        for(int i = 0; i < board.length; i++) {
            if(board[i][j] == '.')
                continue;
            else if(!boolAry[board[i][j] - '0' - 1])
                boolAry[board[i][j] - '0' - 1] = true;
            else
                return false;
        }
        return true;
    }
    
    public boolean checkCube(char[][] board, int q) {
        boolean[] boolAry = new boolean[board.length];
        for(int i = 0; i < 9; i++)
            if(board[i / 3 + (q / 3) * 3][i % 3 + (q % 3) * 3] == '.')
                continue;
            else if(!boolAry[board[i / 3 + (q / 3) * 3][i % 3 + (q % 3) * 3] - '0' - 1])
                boolAry[board[i / 3 + (q / 3) * 3][i % 3 + (q % 3) * 3] - '0' - 1] = true;
            else
                return false;
        return true;
    }
}