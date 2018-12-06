package tp.p1.logic;

import tp.p1.controller.Game;

public abstract class BoardPrinter implements GamePrinter {
	
	
	protected String[] board;
	protected static final String space = " ";
	
	public BoardPrinter (String[] board) {
		this.board = board;
		
	}
	public abstract void encodeGame(Game game);
	public static String boardToString (int cellSize) {
		
		return null;
	}
	@Override
	public void printGame(Game game) {
		this.toString();
		
	}
}
