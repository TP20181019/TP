package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;
import tp.p1.logic.GamePrinter;

public class PrintModeCommand extends Command{
	private String mode;

	private static String cmName = "printMode";
	private static String cmText = "[P]rint <mode>:";
	private static String cmInfo = " change print mode [Realease|Debug";
	
	public PrintModeCommand() {
		super(cmName, cmText, cmInfo);
	}
	
	public PrintModeCommand (String mode) {
		this();
		this.mode = mode;
	}
	@Override
	public void execute(Game game, Controller controller) {
		
	}
	@Override
	public Command parse(String[] commandWords, Controller controller) {
		if (( commandWords.length==1)&& commandWords[0].equalsIgnoreCase(""))
			return new ResetCommand();
		return null;
	}
}
	
