package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class HelpCommand extends NoParamsCommand {

	private static String cmName = "help";
	private static String cmText = "[H]elp:";
	private static String cmInfo = "  print this help message";
	
	public HelpCommand() {
		super(cmName, cmText, cmInfo);
	}

	@Override
	public void execute(Game game, Controller controller) {
		System.out.println("The avaible commands are:" + System.getProperty("line.separator") + CommandParser.commandHelp());
		
	}

}
