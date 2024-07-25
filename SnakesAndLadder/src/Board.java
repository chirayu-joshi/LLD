import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private Cell[][] cells;

    public Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        initializeCells(boardSize);
        addSnakesLadders(numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize) {
        this.cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; ++i) {
            for (int j = 0; j < boardSize; ++j) {
                this.cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesLadders(int numberOfSnakes, int numberOfLadders) {
        while (numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, this.cells.length * this.cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, this.cells.length * this.cells.length - 1);
            if (snakeHead == snakeTail) continue;
            else if (snakeTail > snakeHead) {
                int temp = snakeTail;
                snakeTail = snakeHead;
                snakeHead = temp;
            }

            Jump snakeObj = new Jump(snakeHead, snakeTail);
            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            --numberOfSnakes;
        }

        while (numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, this.cells.length * this.cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, this.cells.length * this.cells.length - 1);
            if (ladderStart == ladderEnd) continue;
            else if (ladderStart > ladderEnd) {
                int temp = ladderEnd;
                ladderEnd = ladderStart;
                ladderStart = temp;
            }

            Jump ladderObj = new Jump(ladderStart, ladderEnd);
            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            --numberOfLadders;
        }
    }

    public Cell getCell(int playerPosition) {
        int boardRow = playerPosition / this.cells.length;
        int boardColumn = playerPosition % this.cells.length;
        return cells[boardRow][boardColumn];
    }

    public int getBoardSize() {
        return this.cells.length;
    }
}
