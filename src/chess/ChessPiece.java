package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board); //como color precisa ser instanciada repassa o serviço para o construtor "super"
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
