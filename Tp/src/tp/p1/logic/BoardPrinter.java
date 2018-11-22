package tp.p1.logic;

import tp.p1.controller.Game;

public abstract class BoardPrinter implements GamePrinter {
	
	private static int dimX; 
	private static int dimY;
	private String[][] board;
	private static String space = " ";
	
	public BoardPrinter (int dimX, int dimY, String[][] board, String space) {
		BoardPrinter.dimX = dimX;
		BoardPrinter.dimY = dimY;
		this.board = board;
		BoardPrinter.space = space;
		
	}

	public void encodeGame(Game game) {
	}
	
	public int getDimX() {
		return dimX;
	}
	public int getDimY() {
		return dimY;
	}
	
	public String [][] getBoard() {
		return board;
	}
	public String getSpace() {
		return space;
	}

}
