package tp.p1.logic;

import tp.p1.controller.Game;
import tp.p1.objects.GameObject;



public class ReleasePrinter extends BoardPrinter{
	
	private final int dimX = 4; 
    private final int dimY = 8;
    private String[][] board;
    private static final String space = " ";

    public ReleasePrinter(Game game){
    	for(int i = 0; i < dimX; i ++) {
    		for(int j = 0; j < dimY; j++)
    			this.board[i][j] = space;
    	}
        encodeGame(game);
             
    }

    
    public void encodeGame (Game game){
    	
        for ( int i  = 0; i< game.getBoard().getListPlants().getStack() ; i++){
        	GameObject obj = game.getBoard().getListPlants().getList(i);
        	board[obj.getX()][obj.getY()] = obj.toString(); 
        }
        for ( int i  = 0; i< game.getBoard().getListZombies().getStack() ; i++){
        	GameObject obj = game.getBoard().getListZombies().getList(i);
        	board[obj.getX()][obj.getY()] = obj.toString(); 
        }
    
    }
//*/
public String printGame(Game game) {

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