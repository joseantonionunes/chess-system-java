
package com.mycompany.jogoxadrez.chess;

import com.mycompany.jogoxadrez.boardgame.Board;
import com.mycompany.jogoxadrez.boardgame.Piece;

public abstract class ChessPiece extends  Piece {
    
    private Color color;

    public ChessPiece( Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    
}
