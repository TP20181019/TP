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
	public void encodeGame(Game game, String name) {
		Plants plant = null;
		GameObjectList Go = null;
		String[][] board = new String[getDimX()][getDimY()];
		for(int i = 0; i < getDimX(); i++) {
			for(int j = 0; j < getDimY(); j++) {
				name =  plant.getPlantName(); 
				GameObject object = Go.existInList(i, j);
				if (object != null)
					board[i][j] = name + "[" + Plants.getLife() + "]";
				else {board[i][j] = getSpace();
				/*	Sunflower sf = game.getSunflowerList().existInList(i, j);
					if (sf != null)
						board[i][j] = "S[" + sf.getVida() + "]";
					else {
						Zombie z = game.getZombieList().existInList(i, j);
						if (z!= null)
							board[i][j] = "Z[" + z.getVida() + "]";*/
						//else 
							
					}
				//}
			}
		}
	}

	public String toString() {

		int cellSize = 7;
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
	@Override
	public void printGame(Game game) {
		// TODO Auto-generated method stub
		
	}

}
