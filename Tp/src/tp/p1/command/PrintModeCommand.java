package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;
import tp.p1.logic.BoardPrinter;
import tp.p1.logic.GamePrinter;
import tp.p1.logic.ReleasePrinter;

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
		if(mode.equalsIgnoreCase("RELEASE")) {
			
		}
	}
	@Override
	public Command parse(String[] commandWords, Controller controller) {
		Command cm = null;
		if (( commandWords.length==2)&& commandWords[0].equalsIgnoreCase("MODE")) {
			if(commandWords[1].equalsIgnoreCase("REALESE"))
				cm = new PrintModeCommand("realese");
			else if(commandWords[1].equalsIgnoreCase("DEBUG"))
				cm = new PrintModeCommand("debug");
		}
		return cm;
	}
}
	
