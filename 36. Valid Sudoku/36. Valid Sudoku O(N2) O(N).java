public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if(!isValidSudokuHelper(board, i, i, 0, 8)
            || !isValidSudokuHelper(board, 0, 8, i, i)
            || !isValidSudokuHelper(board, 3*(i/3), 3*(i/3)+2, 3*(i%3), 3*(i%3)+2)) {
                return false;
            }
        }
        return true;
        

        
        
        
    }
    
    public boolean isValidSudokuHelper(char[][] board, int r1, int r2, int c1, int c2) {
        Set<Character> set = new HashSet();
        
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
        }
        return true;
        
    }
    
    
}