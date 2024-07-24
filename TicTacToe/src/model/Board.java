package model;

import util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if (this.board[row][col] != null) {
            return false;
        }
        this.board[row][col] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < this.size; ++i) {
            for (int j = 0; j < this.size; ++j) {
                if (this.board[i][j] == null) {
                    Pair<Integer, Integer> rowCol = new Pair<>(i, j);
                    freeCells.add(rowCol);
                }
            }
        }

        return freeCells;
    }

    public void printBoard() {
        for (int row = 0; row < this.size; ++row) {
            for (int col = 0; col < this.size; ++col) {
                if (this.board[row][col] != null) {
                    System.out.print(" " + this.board[row][col].pieceType.symbol + " " + getColumnEnd(col));
                } else {
                    System.out.print("   " + getColumnEnd(col));
                }
            }
            if (row != this.size - 1) System.out.println("---|---|---");
        }
    }

    private String getColumnEnd(int col) {
        if (col == this.size - 1) return "\n";
        return "|";
    }
}
