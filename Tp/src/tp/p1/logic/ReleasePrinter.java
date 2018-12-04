package tp.p1.logic;

import tp.p1.controller.Game;
import tp.p1.objects.GameObject;

public class ReleasePrinter extends BoardPrinter {
	private int dimX;
	private int dimY;
	private String[][] board;
	
	public ReleasePrinter(int dimX, int dimY, String [] board, Game game ) {
		super (board);
		this.dimX = dimX;
		this.dimY = dimY;
		printGame(game);
	}
	@Override
	
	public void encodeGame(Game game) {
		this.board = new String[this.dimX][this.dimY];
		for(int i = 0; i < this.dimX; i++) {
			for(int j = 0; j < this.dimY; j++) {
				GameObject object = game.getBoard().getListPlants().existInList(i,j);
				if(object == null)
					object = game.getBoard().getListZombies().existInList(i,j);
				if (object != null)
					board[i][j] = object.toString();
				else {
					board[i][j] = space;
				}
			}
		}
	}

	public String toString() {

		int cellSize = 7;
		int marginSize = 2;
		String vDelimiter = "|";
		String hDelimiter = "-";
		
		String rowDelimiter = MyStringUtils.repeat(hDelimiter, (this.dimY * (cellSize + 1)) - 1);
		String margin = MyStringUtils.repeat(space, marginSize);
		String lineDelimiter = String.format("%n%s%s%n", margin + space, rowDelimiter);
		
		StringBuilder str = new StringBuilder();
		
		str.append(lineDelimiter);
		
		for(int i=0; i<this.dimX; i++) {
				str.append(margin).append(vDelimiter);
				for (int j=0; j<this.dimY; j++) {
					str.append( MyStringUtils.centre(this.board[i][j], cellSize)).append(vDelimiter);
				}
				str.append(lineDelimiter);
		}
		return str.toString();
	}
	@Override
	public void printGame(Game game) {
		this.toString();
		
	}

	



}
