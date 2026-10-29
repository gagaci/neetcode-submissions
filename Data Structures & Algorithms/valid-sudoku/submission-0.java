class Solution {
    public boolean isValidSudoku(char[][] board) {
         // 1.check every row
    for (int row = 0; row < 9; row++) {
      Set<Character> seen = new HashSet<>();
      for (int col = 0; col < 9; col++) {
        char digit = board[row][col];
        if (digit == '.') continue;
        if (!seen.add(digit)) return false;
      }
    }

    // 2. check every column
    for (int col = 0; col < 9; col++) {
      Set<Character> seen = new HashSet<>();
      for (int row = 0; row < 9; row++) {
        char digit = board[row][col];
        if (digit == '.') continue;
        if (!seen.add(digit)) return false;
      }
    }

    for (int boxRow = 0; boxRow < 9; boxRow += 3) { // 0 , 3 , 6
      for (int boxCol = 0; boxCol < 9; boxCol += 3) { // 0 , 3 , 6
        Set<Character> seen = new HashSet<>();
        for (int r = boxRow; r < boxRow + 3; r++) {
          for (int c = boxCol; c < boxCol + 3; c++) {
            char digit = board[r][c];
            if (digit == '.') continue;
            if (!seen.add(digit)) return false;
          }
        }
      }
    }

    return true;
    }
}
