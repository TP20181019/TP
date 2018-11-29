package tp.p1.logic;

import tp.p1.controller.Game;

public abstract class BoardPrinter implements GamePrinter {
	
	protected String[] board;
	private static String space = " ";
	
	public BoardPrinter (String[] board, String space) {
		this.board = board;
		BoardPrinter.space = space;
		
	}
	public abstract void encodeGame(Game game);
	public static String boardToString (int cellSize) {
		return null;
	}
}
