
package com.mycompany.jogoxadrez;

import com.mycompany.jogoxadrez.chess.ChessMatch;
import com.mycompany.jogoxadrez.chess.ChessPiece;
import com.mycompany.jogoxadrez.chess.ChessPosition;
import java.util.Scanner;


public class Jogoxadrez {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
