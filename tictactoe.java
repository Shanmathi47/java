import java.util.Scanner;

public class tictactoe {
    private char[][] board;
    private char currentPlayer;

    public tictactoe() {
        board = new char[3][3];
        currentPlayer = 'X'; // Player 'X' starts the game

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    
    public void makeMove(int row, int col) {
        // Check if the move is valid
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            // Switch to the other player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        } else {
            System.out.println("Invalid move. Try again.");
        }
    }

    
    public boolean checkWin() {
        
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true; 
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true; 
            }
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true; 
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true; 
        }
        return false;
    }

    // Check if the board is full (a tie)
    public boolean checkTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tictactoe game = new tictactoe();

        while (true) {
            game.displayBoard();

            System.out.println("Player " + game.currentPlayer + "'s turn. Enter row (0-2) and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

           
            game.makeMove(row, col);

           
            if (game.checkWin()) {
                game.displayBoard();
                System.out.println("Player " + game.currentPlayer + " wins!");
                break;
            }

            
            if (game.checkTie()) {
                game.displayBoard();
                System.out.println("It's a tie!");
                break;
            }
        }

        
    }
}