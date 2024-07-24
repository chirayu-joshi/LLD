package model;

public enum PieceType {
    X("X"),
    O("O");

    final String symbol;

    PieceType(String symbol) {
        this.symbol = symbol;
    }
}
