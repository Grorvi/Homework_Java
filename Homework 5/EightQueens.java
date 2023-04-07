public class EightQueens {
    private static final int BOARD_SIZE = 8;
    private static final char QUEEN = 'Q';
    private static final char EMPTY = '0';
    private static final char ATTACKED = 'x';

    private static char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

    public static void main(String[] args) {
        initializeBoard();
        placeQueens(0);
        printBoard();
    }

    private static void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void placeQueens(int row) {
        if (row == BOARD_SIZE) {
            return;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isSafe(row, col)) {
                board[row][col] = QUEEN;
                placeQueens(row + 1);
                if (row == BOARD_SIZE - 1) {
                    return;
                }
                board[row][col] = EMPTY;
            }
        }
    }

    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == QUEEN) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < BOARD_SIZE; i--, j++) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == QUEEN) {
                    System.out.print(QUEEN);
                } else {
                    System.out.print(EMPTY);
                }
            }
            System.out.println();
        }
    }
}
