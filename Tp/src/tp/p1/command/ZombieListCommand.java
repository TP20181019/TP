package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class ZombieListCommand extends Command{
	
	private static String cmName = "zombieList";
	private static String cmText = "zombieList:";
	private static String cmInfo = " print the list of zombies";

	public ZombieListCommand() {
		// TODO Auto-generated constructor stub
		super(cmName, cmText, cmInfo);
	}

	@Override
	public void execute(Game game, Controller controller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Command parse(String[] commandWords, Controller controller) {
		if (( commandWords.length==1)&& ( commandWords[0].equalsIgnoreCase(cmName)))
			return new ResetCommand();
		return null;
	}

}
