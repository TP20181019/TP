package tp.p1.logic;

import tp.p1.lists.GameObjectList;
//import tp.p1.objects.Plants;
import tp.p1.objects.GameObject;
import tp.p1.controller.Game;

public class DebugPrinter extends BoardPrinter {
  
	public DebugPrinter(Game game) {
		int max = game.getBoard().getListPlants().getStack() + 
				game.getBoard().getListZombies().getStack();
		for(int i = 0; i < max; i++) {
			this.board[i] = space;
		}
		encodeGame(game);
	}
	
	
	public void encodeGame(Game game) {
		int i = 0;
		while(i < this.board.length) {
			for (int j  = 0; j< game.getBoard().getListPlants().getStack() ; j++){
		        GameObject obj = game.getBoard().getListPlants().getList(j);
		        board[i] = obj.toString(); 
		        i++;
		        }
			 for (int k  = 0; k< game.getBoard().getListZombies().getStack() ; k++){
	        	GameObject obj = game.getBoard().getListZombies().getList(k);
		        board[i] = obj.toString(); 
		        i++;
		        }
		}
	}

	@Override
	public String printGame(Game game) {
		int marginSize = 1;
		String vDelimiter = "|";
		StringBuilder str = new StringBuilder();
		if (this.board.length == 0){
	        str.append(" no hay objetos que mostrar");
	    }
		else {
			for(int i=0; i<this.board.length ; i++) {
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



