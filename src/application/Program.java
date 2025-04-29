package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //1 call
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			try {
				UI.clearScreen(); //2
				UI.printBoard(chessMatch.getPieces()); //3 e 4
				System.out.println(); //5
				System.out.print("Source: "); //6
				ChessPosition source = UI.readChessPosition(sc); //7
				
				System.out.println(); //8
				System.out.print("Target: "); //9
				ChessPosition target = UI.readChessPosition(sc); //10
				
				@SuppressWarnings("unused")
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target); //11
				
			} catch (ChessException e) {
				System.out.println(e.getMessage()); //12  e 13
				sc.nextLine(); //14
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage()); //15 e 16
				sc.nextLine(); //17
			}
			
		}
	}
}
