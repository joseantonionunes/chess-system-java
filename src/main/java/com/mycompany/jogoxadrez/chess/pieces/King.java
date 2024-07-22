
package com.mycompany.jogoxadrez.chess.pieces;

import com.mycompany.jogoxadrez.boardgame.Board;
import com.mycompany.jogoxadrez.chess.ChessPiece;
import com.mycompany.jogoxadrez.chess.Color;

public class King extends ChessPiece {
    
    public King(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
    
}
