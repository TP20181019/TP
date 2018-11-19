package tp.p1.command;

import tp.p1.controller.Controller;

public class CommandParser {
	private static Command c;
	private static NoParamsCommand npc;

	private static Command[] availableCommands = {
			new AddCommand(),
			new HelpCommand(),
			new ResetCommand(),
			new ExitCommand(),
			new ListCommand(),
			new NoneCommand(),
			};

	
	public static Command parseCommand(String[ ] commandWords, Controller controller) {
		if (commandWords.length > 0) {
			int i = 0;
			do {
				c = availableCommands[i].parse(commandWords, controller);
				i++;
			} while ((i < availableCommands.length) && (c == null));
			
			return c;

		}
		else { //Si no metemos nada
			return null;
		}
		
	}
	public static String commandHelp() {
		
		return null;
		//incoca el metodo helpText() de cada subclase command
		//Este metodo es invocado por el metodo execute de la clase HelpCommand
	}
}
