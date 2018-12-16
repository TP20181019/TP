package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class ExitCommand extends NoParamsCommand{
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

}
