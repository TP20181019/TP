package tp.p1.logic;

import tp.p1.lists.GameObjectList;
//import tp.p1.objects.Plants;
import tp.p1.objects.GameObject;
import tp.p1.controller.Game;

public abstract class DebugPrinter extends BoardPrinter {
    
	
	private int sizeBoardX = 20;
	//si pones mas de uno, pinta mas filas debajo
    private int sizeBoardY = 1;
    String[]board = new String [sizeBoardX];
  //GameObject obj = new GameObject (3,2,2," ");
    
    public DebugPrinter(String []board, Game game){
        super(board);
        printGame(game);
        //GameObjectList obList = new GameObjectList();
        
        
        
    }

    
    public void encodeGame (Game game){
    	
    	
    
    	   
        for ( int i  = 0; i< this.sizeBoardX; i++){
        	//GameObject object;
        	//board [i] = obj.toString();
        	 
        	
           	
            
        }
    }
    
    public String toString() {
    	
        
        //cellSize es 20 para que entre toda la cadena en el cuadro
		int cellSize = 20;
		int marginSize = 1;
		String vDelimiter = "|";
		String hDelimiter = "-";
		//sizeBoardX mide cuantos recuadros va a tapar los guiones.
		String rowDelimiter = MyStringUtils.repeat(hDelimiter, (this.sizeBoardX * (cellSize + 1)) - 1);
		String margin = MyStringUtils.repeat(space, marginSize);
		String lineDelimiter = String.format("%n%s%s%n", margin + space, rowDelimiter);
		
		StringBuilder str = new StringBuilder();
		
		str.append(lineDelimiter);
		if (this.sizeBoardX == 0){
            str.append(" no hay objetos que mostrar");
        }else {
		for(int i=0; i<this.sizeBoardY; i++) {
				str.append(margin).append(vDelimiter);
                               for (int j=0; j<this.sizeBoardX; j++) {
                               /////aqui se pone lo que va dentro del cuadrito. en el array
					str.append( MyStringUtils.centre(board[i], cellSize)).append(vDelimiter);
                               
				}
				str.append(lineDelimiter);  
		}}
		return str.toString();
	}
   
}



