class Solution {
    public void solveSudoku(char[][] board) {
        dfs(board,0, 0, board);
    }

    public boolean dfs(char[][] board, int r, int c, char[][] answer) {
        if(checkBoard(board)) {
            for(int i = 0; i < 9; i++)
                for(int j = 0; j < 9; j++)
                    answer[i][j] = board[i][j];
            return true;
        }
        if(r > 8)
            return false;
        if(board[r][c] != '.')
            if(r == 8)
                return dfs(board, 0, c + 1, answer);
            else
                return dfs(board, r + 1, c, answer);

        char[][] curBoard = copyBoard(board);
        boolean[] notPossible = new boolean[9];

        for(int i = 0; i < 9; i++)
            if(curBoard[r][i] != '.')
                notPossible[curBoard[r][i] - '0' - 1] = true;

        for(int i = 0; i < 9; i++)
            if(curBoard[i][c] != '.')
                notPossible[curBoard[i][c] - '0' - 1] = true;

        for(int i = 0; i < 9; i++)
            if(curBoard[(r / 3) * 3 + i / 3][(c / 3) * 3 + i % 3] != '.')
                notPossible[curBoard[(r / 3) * 3 + i / 3][(c / 3) * 3 + i % 3] - '0' - 1] = true;

        for(int i = 0; i < 9; i++)
            if(!notPossible[i]) {
                curBoard[r][c] = Character.forDigit(i + 1 , 10);
                if(r < 8 && dfs(curBoard, r + 1, c, answer))
                    return true;
                if(r == 8 && dfs(curBoard, 0, c + 1, answer))
                    return true;
                curBoard[r][c] = '.';
            }
        return false;
    }

    public char[][] copyBoard(char[][] board) {
        char[][] copy = new char[9][9];
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++)
                copy[i][j] = board[i][j];
        return copy;
    }

    public boolean checkBoard(char[][] board) {
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.')
                    return false;
            }
        }
        return true;
    }
}