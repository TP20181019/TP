package tp.p1.command;

import tp.p1.controller.Controller;

public class CommandParser {

	public CommandParser() {
		// TODO Auto-generated constructor stub
	}
	/*private static Command[] availableCommands = {
			new AddCommand(),
			new HelpCommand(),
			new ResetCommand(),
			new ExitCommand(),
			new ListCommand(),
			new NoneCommand(),
			};
*/
	
	public static Command parseCommand(String[ ] commandWords, Controller controller) {
		return null;
		
	}
	public static String commandHelp() {
		return null;
		//incoca el metodo helpText() de cada subclase command
		//Este metodo es invocado por el metodo execute de la clase HelpCommand
	}
}
