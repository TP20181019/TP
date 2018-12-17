package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class NoneCommand extends Command{

	private static String cmName = "none";
	private static String cmText = "none:";
	private static String cmInfo = " skips cycle";
	
	public NoneCommand() {
		super(cmName, cmText, cmInfo); 
	}
	@Override
	public void execute(Game game, Controller controller) {
		game.update();
		
	}
	
	public Command parse(String[] commandWords, Controller controller) {
		if (( commandWords.length==1)&& commandWords[0].equalsIgnoreCase(cmName) || commandWords[0].equalsIgnoreCase("")) {
			return new NoneCommand();
		}
		else return null;
	}

}
