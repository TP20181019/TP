package tp.p1.logic;

import tp.p1.controller.Game;
import tp.p1.objects.GameObject;



public class ReleasePrinter {
    private final int dimX =4; 
private final int dimY = 8;
private String[][] board;
private static final String space = " ";

public ReleasePrinter() {
	
	
	encodeGame();
}
private void encodeGame() {
	board = new String[dimX][dimY];
	for(int i = 0; i < dimX; i++) {
		for(int j = 0; j < dimY; j++) {
                        board [i][j] = "lool";// aqui va lo de dentro del cuadro.
                        
			/*Peashooter ps = game.getPeashooterList().existInList(i, j);
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
			}*/
		}
	}
}
//*/
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

}