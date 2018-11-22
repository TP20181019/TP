package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class HelpCommand extends Command {

	public HelpCommand(String commandText, String commandTextMsg, String helpTextMsg) {
		super(commandText, commandTextMsg,helpTextMsg);
	}
	public HelpCommand() {
		super("help", "[H]elp:", " print this help message");
	}

	@Override
	public void execute(Game game, Controller controller) {
		System.out.println("The avaible commands are:" + System.getProperty("line.separator") + CommandParser.commandHelp());
		
	}

	@Override
	public Command parse(String[] commandWords, Controller controller) {
		if ((commandWords.length==1)&& (commandWords[0].equalsIgnoreCase("HELP")))
			return new HelpCommand();
		else 
			return null;
	}
}
