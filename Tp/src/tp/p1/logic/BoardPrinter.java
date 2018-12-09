package tp.p1.logic;

import tp.p1.controller.Game;

public abstract class BoardPrinter implements GamePrinter {
	
	
	protected String[] board;
	protected static final String space = " ";
	static final int MAX = 100;
	
	public BoardPrinter () {
		for(int i = 0; i < MAX; i++) {
			board[i] = null;
		}
		
	}
	public abstract void encodeGame(Game game);
	public static String boardToString (int cellSize) {
		
		return null;
	}
}
