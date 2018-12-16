package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class ListCommand extends NoParamsCommand {
	private static String cmName = "list";
	private static String cmText = "[L]ist:";
	private static String cmInfo = " print the list of available plants.";

	public ListCommand() {
		super(cmName, cmText, cmInfo);
	}

	@Override
	public void execute(Game game, Controller controller) {
		game.showList();
		
	}
	

}
