import model.*;
import util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    private Deque<Player> players;
    private Board gameBoard;

    TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame() {
        this.players = new LinkedList<>();

        // Creating 2 players
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);

        players.offer(player1);
        players.offer(player2);

        // Initialize board
        this.gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            // Take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();

            // Get the free space from the board
            this.gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = this.gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            // Read the user input
            System.out.println("Player: " + playerTurn.getName() + ", enter row,column: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int row = Integer.parseInt(values[0]);
            int col = Integer.parseInt(values[1]);

            // Place the piece
            boolean pieceAddedSuccessfully = this.gameBoard.addPiece(row, col, playerTurn.getPlayingPiece());
            if (!pieceAddedSuccessfully) {
                // Player cannot insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(row, col, playerTurn.getPlayingPiece().getPieceType());
            if (winner) {
                return playerTurn.getName();
            }
        }

        return "tie";
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check rows
        for (int i = 0; i < this.gameBoard.size; ++i) {
            if (this.gameBoard.board[row][i] == null || this.gameBoard.board[row][i].getPieceType() != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // Check columns
        for (int i = 0; i < this.gameBoard.size; ++i) {
            if (this.gameBoard.board[i][col] == null || this.gameBoard.board[i][col].getPieceType() != pieceType) {
                colMatch = false;
                break;
            }
        }

        // Check diagonal
        for (int i = 0, j = 0; i < this.gameBoard.size && j < this.gameBoard.size; ++i, ++j) {
            if (this.gameBoard.board[i][j] != null || this.gameBoard.board[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        // Check anti-diagonal
        for (int i = 0, j = this.gameBoard.size - 1; i < this.gameBoard.size; ++i, --j) {
            if (this.gameBoard.board[i][j] == null || this.gameBoard.board[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
