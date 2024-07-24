package model;

public abstract class PlayingPiece {
    protected final PieceType pieceType;

    protected PlayingPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return this.pieceType;
    }
}
