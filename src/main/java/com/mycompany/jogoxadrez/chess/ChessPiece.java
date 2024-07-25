
package com.mycompany.jogoxadrez.chess;

import com.mycompany.jogoxadrez.boardgame.Board;
import com.mycompany.jogoxadrez.boardgame.Piece;
import com.mycompany.jogoxadrez.boardgame.Position;

public abstract class ChessPiece extends  Piece {
    
    private Color color;

    public ChessPiece( Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
