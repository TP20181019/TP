package tp.p1.command;

import tp.p1.controller.Controller;


public abstract class NoParamsCommand  extends Command{
	
	
//de esta clase heredan las subclases que no reciben parametros
	public NoParamsCommand(String cmName, String cmText, String cmInfo) {
		// TODO Auto-generated constructor stub
		// de command
		super(cmName, cmText, cmInfo);
	}
	
	public Command parse(String[] commandWords, Controller controller) {
		if ((commandWords.length==1)&& (commandWords[0].equalsIgnoreCase(commandName.substring(0,1))) || commandWords[0].equalsIgnoreCase(commandName))
			return this;
		else 
			return null;
	}
}
