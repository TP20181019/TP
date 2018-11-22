package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class PrintModeCommand extends Command{
	private String mode;

	private static String cmName = "printMode";
	private static String cmText = "[P]rint <mode>:";
	private static String cmInfo = " change print mode [Realease|Debug";
	public PrintModeCommand (String mode) {
		super(cmName, cmText, cmInfo);
		this.mode = mode;
	}
	@Override
	public void execute(Game game, Controller controller) {
		game.print(this.mode);
		
	}
	@Override
	public Command parse(String[] commandWords, Controller controller) {
		if (( commandWords.length==1)&& commandWords[0].equalsIgnoreCase(""))
			return new ResetCommand();
		return null;
	}
}
	
