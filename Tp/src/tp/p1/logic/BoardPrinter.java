package tp.p1.logic;

import tp.p1.controller.Game;

public abstract class BoardPrinter implements GamePrinter {
	
	
	protected String[] board;
	protected static final String space = " ";
	static final int MAX = 100;
	
	public BoardPrinter() {
		board = new String[MAX];
		for(int i = 0; i < MAX; i++)
			board[i] = space;
	}
	
	public abstract void encodeGame(Game game);
	public static String boardToString (int cellSize) {
		int marginSize = 2;
		String hDelimiter = "-";
		String rowDelimiter = MyStringUtils.repeat(hDelimiter, (7 * (cellSize + 1)) - 1);
		String margin = MyStringUtils.repeat(space, marginSize);
		String lineDelimiter = String.format("%n%s%s%n", margin + space, rowDelimiter);
		
		StringBuilder str = new StringBuilder();
		
		str.append(lineDelimiter);
		return str.toString();
	}
	
}
