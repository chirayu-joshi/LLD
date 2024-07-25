import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerList;
    Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        this.board = new Board(10, 5, 4);
        this.dice = new Dice(1);
        this.winner = null;
        this.playerList = createPlayers(2);
    }

    private Deque<Player> createPlayers(int playerCount) {
        Deque<Player> players = new LinkedList<>();
        for (int i = 0; i < playerCount; ++i) {
            players.add(new Player("p" + (i + 1), 0));
        }
        return players;
    }

    private Player findPlayerWithCurrentTurn() {
        Player currentTurnPlayer = this.playerList.removeFirst();
        this.playerList.addLast(currentTurnPlayer);
        return currentTurnPlayer;
    }

    private int jumpCheck(int playerNewPosition) {
        if (playerNewPosition > this.board.getBoardSize() * this.board.getBoardSize() - 1) {
            return playerNewPosition;
        }
        Cell cell = board.getCell(playerNewPosition);
        if (cell.jump != null && cell.jump.start == playerNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end) ? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

    public void startGame() {
        while (this.winner == null) {
            // Get current turn player
            Player currentTurnPlayer = findPlayerWithCurrentTurn();
            System.out.println("Player turn is: " + currentTurnPlayer.id + ". Current position is: " + currentTurnPlayer.currentPosition);

            // Roll the dice
            int diceNumbersTotal = dice.rollDice();

            // Get new position
            int currentTurnPlayerNewPosition = currentTurnPlayer.currentPosition + diceNumbersTotal;
            currentTurnPlayerNewPosition = jumpCheck(currentTurnPlayerNewPosition);
            currentTurnPlayer.currentPosition = currentTurnPlayerNewPosition;

            System.out.println("Player turn is: " + currentTurnPlayer.id + ". New position is: " + currentTurnPlayerNewPosition);
            // Check for the winning position
            if (currentTurnPlayerNewPosition >= this.board.getBoardSize() * this.board.getBoardSize() - 1) {
                this.winner = currentTurnPlayer;
            }
        }

        System.out.println("Winner is: " + this.winner.id);
    }
}
