package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class AddCommand extends Command{
	
	private int x;
	private int y;
	private String plantName;

	public AddCommand(String commandText, String commandTextMsg, String helpTextMsg, 
			int x, int y, String plantName) {
		super(commandText, commandTextMsg,helpTextMsg);
		this.x = x;
		this.y = y;
		this.plantName = plantName;
		
	}

	@Override
	public void execute(Game game, Controller controller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Command parse(String[] commandWords, Controller controller) {
		// TODO Auto-generated method stub
		return null;
	}
}
