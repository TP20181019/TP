package tp.p1.logic;

import tp.p1.lists.GameObjectList;
//import tp.p1.objects.Plants;
import tp.p1.objects.GameObject;
import tp.p1.controller.Game;

public abstract class DebugPrinter extends BoardPrinter {
    

	private int sizeBoardX = 20;
    private int sizeBoardY = 1;
    public DebugPrinter(String []board, Game game){
        super(board);
        printGame(game);
        //GameObjectList obList = new GameObjectList();
        
        
        
    }

    
    public void encodeGame (Game game){
    	
    	this.board = new String[sizeBoardX];
    
    	   //recorrer la lista de objetos para obtener las plantas a mostrar
        for ( int i  = 0; i< this.sizeBoardX; i++){
        	//GameObject object;
        	board [i] = toString();
        	 
        	
           	
            
        }
    }
    public String toString() {
        String[] out = new String [sizeBoardX];

		int cellSize = 20;
		int marginSize = 1;
		String vDelimiter = "|";
		String hDelimiter = "-";
		
		String rowDelimiter = MyStringUtils.repeat(hDelimiter, (this.sizeBoardY * (cellSize + 1)) - 1);
		String margin = MyStringUtils.repeat(space, marginSize);
		String lineDelimiter = String.format("%n%s%s%n", margin + space, rowDelimiter);
		
		StringBuilder str = new StringBuilder();
		
		str.append(lineDelimiter);
		
		for(int i=0; i<this.sizeBoardY; i++) {
				str.append(margin).append(vDelimiter);
				//for (int j=0; j<this.sizeBoard; j++) {
					str.append( MyStringUtils.centre(out[i], cellSize)).append(vDelimiter);
				//}
				str.append(lineDelimiter);
		}
		return str.toString();
	}
   
}



