package tp.p1.logic;

import tp.p1.lists.GameObjectList;
//import tp.p1.objects.Plants;
import tp.p1.objects.GameObject;
import tp.p1.controller.Game;

public abstract class DebugPrinter extends BoardPrinter {
    //longitud para que alcance los objetos
	private int sizeBoardX;
	//si pones mas de uno, pinta mas filas debajo
    private int sizeBoardY;
    
    public DebugPrinter(Game game){
        super();
        encodeGame(game);
        //GameObjectList obList = new GameObjectList();
             
    }

    
    public void encodeGame (Game game){
    	
    	Board board = game.getBoard();
    	GameObjectList listPlant = board.getListPlants();
    	GameObjectList listZombie = board.getListZombies();
    	   
        for ( int i  = 0; i< listPlant.getStack() ; i++){
        	//GameObject object;
        	//board [i] = obj.toString();
        	listPlant.getList(i);
        
        }
    }
    
    	public static String boardToString (int cellSize) {
		
        //cellSize es 20 para que entre toda la cadena en el cuadro
		cellSize = 20;
		int marginSize = 1;
		String vDelimiter = "|";
		String hDelimiter = "-";
		//sizeBoardX mide cuantos recuadros va a tapar los guiones.
		String rowDelimiter = MyStringUtils.repeat(hDelimiter, (listPlant.getStack() * (cellSize + 1)) - 1);
		String margin = MyStringUtils.repeat(space, marginSize);
		String lineDelimiter = String.format("%n%s%s%n", margin + space, rowDelimiter);
		
		StringBuilder str = new StringBuilder();
		
		str.append(lineDelimiter);
		if (this.sizeBoardX == 0){
            str.append(" no hay objetos que mostrar");
        }
		else {
		for(int i=0; i<this.sizeBoardY; i++) {
				str.append(margin).append(vDelimiter);
                               for (int j=0; j<this.sizeBoardX; j++) {
                               /////aqui se pone lo que va dentro del cuadrito. en el array
					str.append( MyStringUtils.centre(board[j], cellSize)).append(vDelimiter);
        //necesito una condicion para pintar uno por uno los objetos. es decir
					//algo como un ExistList 
				}          
                               
				str.append(lineDelimiter);  
		}}
		return str.toString();
	}
   
}



