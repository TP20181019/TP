package tp.p1.logic;
import tp.p1.controller.Game;

public class DebugPrinter extends BoardPrinter {
 
	public DebugPrinter(int x, int y) {
		super(x, y);
	}

	public void encodeGame(Game game) {
		int i;
		for(i = 0; i < game.getBoard().getStackPlantas(); i++) {
			board[0][i] = game.getBoard().getPlant(i).toStringDebug();
		}
		
		for(int j = 0; j < game.getBoard().getStackZombies(); j++) {
			board[0][i + j] = game.getBoard().getZombie(j).toStringDebug();
		}
	}

	public String printGame(Game game) {
		int dimY = (game.getBoard().getStackPlantas() + game.getBoard().getStackZombies());
		String line;
		line = "LEVEL: " + game.getLevel()+ "\n" + 
		"Seed: " + game.getRand().toString() +"\n" ;
		encodeGame(game);
		return  line + "\n\n" + super.boardToString(20,1,dimY);
	}

	
   
}



