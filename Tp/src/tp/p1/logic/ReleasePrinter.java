package tp.p1.logic;

import tp.p1.controller.Game;
import tp.p1.objects.GameObject;
import tp.p1.objects.GameObjectList;
import tp.p1.objects.Plants;

public class ReleasePrinter extends BoardPrinter {

	
	public ReleasePrinter(int dimX, int dimY, String [][] board, String space, Game game ) {
		super (dimX,dimY,board,space);
		
		printGame(game);
	}
	@Override
	
	public void encodeGame(Game game) {
		Plants plant = null;
		GameObjectList Go = null;
		String[][] board = new String[getDimX()][getDimY()];
		for(int i = 0; i < getDimX(); i++) {
			for(int j = 0; j < getDimY(); j++) {
				GameObject object = Go.existInList(i, j);
				if (object != null)
					board[i][j] = plant.getPlantName() + "[" + Plants.this.getLife() + "]";
				else {board[i][j] = getSpace();
				}
			}
		}
	}

	public String toString() {

		int cellSize = 7;
		int marginSize = 2;
		String vDelimiter = "|";
		String hDelimiter = "-";
		
		String rowDelimiter = MyStringUtils.repeat(hDelimiter, (getDimY() * (cellSize + 1)) - 1);
		String margin = MyStringUtils.repeat(getSpace(), marginSize);
		String lineDelimiter = String.format("%n%s%s%n", margin + getSpace(), rowDelimiter);
		
		StringBuilder str = new StringBuilder();
		
		str.append(lineDelimiter);
		
		for(int i=0; i<getDimX(); i++) {
				str.append(margin).append(vDelimiter);
				for (int j=0; j<getDimY(); j++) {
					str.append( MyStringUtils.centre(getBoard()[i][j], cellSize)).append(vDelimiter);
				}
				str.append(lineDelimiter);
		}
		return str.toString();
	}
	@Override
	public void printGame(Game game) {
		// TODO Auto-generated method stub
		
	}

	



}
