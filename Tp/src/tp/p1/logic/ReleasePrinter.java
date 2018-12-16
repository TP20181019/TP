package tp.p1.logic;

import tp.p1.controller.Game;
import tp.p1.objects.GameObject;



public class ReleasePrinter extends BoardPrinter{

    public ReleasePrinter(int x, int y){
    	super(x,y); 
    }

    
    public void encodeGame (Game game){
    	
        for ( int i  = 0; i< game.getBoard().getStackPlantas() ; i++){
        	GameObject obj = game.getBoard().getPlant(i);
        	board[obj.getX()][obj.getY()] = obj.toString(); 
        }
        for ( int i  = 0; i< game.getBoard().getStackZombies() ; i++){
        	GameObject obj = game.getBoard().getZombie(i);
        	board[obj.getX()][obj.getY()] = obj.toString(); 
        }
    }

	public String printGame(Game game) {
		encodeGame(game);
		return super.boardToString(game.getDimY(), game.getDimX(), game.getDimY());
	}

}