package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class ResetCommand extends NoParamsCommand {
	private static String cmName = "reset";
	private static String cmText = "[R]eset:";
	private static String cmInfo = "  resets game";

	public ResetCommand() {
		super(cmName, cmText, cmInfo);
	}

	@Override
	public void execute(Game game, Controller controller) {
		game.reset();
		
	}
	@Override
	public Command parse(String[] commandWords, Controller controller) {
		if (( commandWords.length==1)&& ( commandWords[0].equalsIgnoreCase(cmName)))
			return new ResetCommand();
		else return null;
	}
}
