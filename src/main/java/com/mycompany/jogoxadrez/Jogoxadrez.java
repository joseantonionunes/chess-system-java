
package com.mycompany.jogoxadrez;

import com.mycompany.jogoxadrez.chess.ChessException;
import com.mycompany.jogoxadrez.chess.ChessMatch;
import com.mycompany.jogoxadrez.chess.ChessPiece;
import com.mycompany.jogoxadrez.chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Jogoxadrez {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException e) {
                    System.out.println(e.getMessage());
                    sc.nextLine();
            }
            catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                    sc.nextLine();
            }

        }
    }
}
