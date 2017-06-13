public class Challenge20
{
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        // 0 = 'O', 1 = 'X'.
        // top row
        board[0][0] = 0;
        board[0][1] = 1;
        board[0][2] = 0;
        
        // middle row
        board[1][0] = 1;
        board[1][1] = 0;
        board[1][2] = 1;
        
        // bottom row
        board[2][0] = 1;
        board[2][1] = 1;
        board[2][2] = 1;
        
        printBoard(board);
        checkWin(board);
    }
    
    public static void checkWin(int[][] gameBoard) {
        if(gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2]) {
            System.out.println("Win for " + checkSquare(gameBoard[0][0]));
        }
        if(gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2]) {
            System.out.println("Win for " + checkSquare(gameBoard[1][0]));
        }
        if(gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2]) {
            System.out.println("Win for " + checkSquare(gameBoard[2][0]));
        }
        if(gameBoard[0][0] == gameBoard[1][0] && gameBoard[1][0] == gameBoard[2][0]) {
            System.out.println("Win for " + checkSquare(gameBoard[0][0]));
        }
        if(gameBoard[0][1] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][1]) {
            System.out.println("Win for " + checkSquare(gameBoard[0][1]));
        }
        if(gameBoard[0][2] == gameBoard[1][2] && gameBoard[1][2] == gameBoard[2][2]) {
            System.out.println("Win for " + checkSquare(gameBoard[0][2]));
        }
        if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) {
            System.out.println("Win for " + checkSquare(gameBoard[0][0]));
        }
        if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]) {
            System.out.println("Win for " + checkSquare(gameBoard[0][2]));
        }
    }
    
    public static void printBoard(int[][] gameBoard) {
        for(int i = 0;i < gameBoard.length;i++) {
            for(int j = 0;j < gameBoard[i].length;j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }
    
    public static String checkSquare(int number) {
        if(number == 1) {
            return "X";
        } else {
            return "O";
        }
    }
}
