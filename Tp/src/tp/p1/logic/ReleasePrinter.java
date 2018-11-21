package tp.p1.logic;

import tp.p1.controller.Game;

public class ReleasePrinter extends BoardPrinter {

	
	public ReleasePrinter(int dimX, int dimY, String [][] board, String space, Game game ) {
		super (dimX,dimY,board,space);
		
		encodeGame(game);
	}
	private void encodeGame(Game game) {
		getBoard() = new String[dimX][dimY];
		for(int i = 0; i < dimX; i++) {
			for(int j = 0; j < dimY; j++) {
				Peashooter ps = game.getPeashooterList().existInList(i, j);
				if (ps != null)
					board[i][j] = "P[" + ps.getVida() + "]";
				else {
					Sunflower sf = game.getSunflowerList().existInList(i, j);
					if (sf != null)
						board[i][j] = "S[" + sf.getVida() + "]";
					else {
						Zombie z = game.getZombieList().existInList(i, j);
						if (z!= null)
							board[i][j] = "Z[" + z.getVida() + "]";
						else 
							board[i][j] = space;
					}
				}
			}
		}
	}



}
