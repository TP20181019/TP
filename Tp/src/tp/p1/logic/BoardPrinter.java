package tp.p1.logic;

import tp.p1.controller.Game;

public abstract class BoardPrinter implements GamePrinter {
	
	
	protected static String[][] board;
	protected static final String space = " ";
	
	public BoardPrinter(int x, int y) {
		board = new String[x][y];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++)
				board[i][j] = space;
		}
			
	}
	
	public abstract void encodeGame(Game game);
	
	public static String boardToString (int cellSize, int dimX, int dimY) {
		int marginSize = 2;
		String vDelimiter = "|";
		String hDelimiter = "-";
		 
		String rowDelimiter = MyStringUtils.repeat(hDelimiter, (dimY * (cellSize + 1)) - 1);
		String margin = MyStringUtils.repeat(space, marginSize);
		String lineDelimiter = String.format("%n%s%s%n", margin + space, rowDelimiter);
		
		StringBuilder str = new StringBuilder();
		
		str.append(lineDelimiter);
		
		for(int i=0; i<dimX; i++) {
				str.append(margin).append(vDelimiter);
				for (int j=0; j<dimY; j++) {
					str.append( MyStringUtils.centre(board[i][j], cellSize)).append(vDelimiter);
				}
				str.append(lineDelimiter);
		}
		return str.toString();
	}
	
}
