
package com.mycompany.jogoxadrez;

import com.mycompany.jogoxadrez.chess.ChessMatch;


public class Jogoxadrez {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
