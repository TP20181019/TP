package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class ListCommand extends Command {

	public ListCommand(String commandText, String commandTextMsg, String helpTextMsg) {
		super(commandText, commandTextMsg, helpTextMsg);
		// TODO Auto-generated constructor stub
	}
	public ListCommand() {
		super("", "", "");
	}

	@Override
	public void execute(Game game, Controller controller) {
		// TODO Auto-generated method stub
		
	}

	public String helpText() {
		return "[L]ist: print the list of available plants.";
	}
	
	@Override
	public Command parse(String[] commandWords, Controller controller) {
		if (( commandWords.length==1)&& ( commandWords[0].equalsIgnoreCase("L") || commandWords[0].equalsIgnoreCase("LIST")))
			return new ListCommand();
		else return null;
	}

}
