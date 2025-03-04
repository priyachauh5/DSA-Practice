public class Word_Search {
    public static boolean exist(char board[][], String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (backtrack(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false; // Return false if word is not found
    }

    public static boolean backtrack(char board[][], String word, int i, int j, int k) {
        if (k == word.length()) {
            return true; // Word found
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k) || board[i][j] == '*') {
            return false; // Out of bounds or character doesn't match
        }
        char temp = board[i][j]; // Store the character
        board[i][j] = '*'; // Mark the current cell as visited

        // Explore all directions: up, down, left, right
        boolean found = backtrack(board, word, i - 1, j, k + 1) || // up
                        backtrack(board, word, i + 1, j, k + 1) || // down
                        backtrack(board, word, i, j - 1, k + 1) || // left
                        backtrack(board, word, i, j + 1, k + 1);   // right

        board[i][j] = temp; // Restore the character

        return found;
    }

    public static void main(String args[]) {
        char board[][] = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println("Word is present: " + exist(board, word));
    }
}
