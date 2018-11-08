package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public abstract class Command {
	
	private String helpText;
	private String helpInfo;
	protected final String commandName;
	
	public Command(String commandText, String commandTextMsg, String helpTextMsg) {
		helpText = commandTextMsg;
		helpInfo = helpTextMsg;
		commandName = commandText;
		
	}
	// Some commands may generate an error in the execute or parse methods.
	// In the absence of exceptions , they must the tell the controller not to print the board
	
	public abstract void execute(Game game, Controller controller);//metodo de game 
	public abstract Command parse(String[] commandWords, Controller controller);
	public String helpText(){return " " + helpText + ": " + helpInfo;}

}
