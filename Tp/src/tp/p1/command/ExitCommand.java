package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class ExitCommand extends Command{
	private static String cmName = "exit";
	private static String cmText = "[E]xit:";
	private static String cmInfo = " terminate the program";

	public ExitCommand() {
		super(cmName, cmText, cmInfo);
	}

	@Override
	public void execute(Game game, Controller controller) {
		game.setEnd(true);
	}

	@Override
	public Command parse(String[] commandWords, Controller controller) {
		if (( commandWords.length==1)&& (commandWords[0].equalsIgnoreCase("E") || commandWords[0].equalsIgnoreCase(cmName)))
			return new ExitCommand();
		else return null;
	}

}
