package tp.p1.command;

import tp.p1.controller.Controller;

public class CommandParser {

	private static Command[] availableCommands = {
			new AddCommand(),
			new HelpCommand(),
			new ResetCommand(),
			new ExitCommand(),
			new ListCommand(),
			new ZombieListCommand(),
			new PrintModeCommand(),
			new NoneCommand(),
			};

	
	public static Command parseCommand(String[ ] commandWords, Controller controller) {
		Command cm = null;
		for (Command command:availableCommands){
			cm= command.parse(commandWords, controller);
			if (cm!=null) return cm;
		}
		return cm;
		
	}
	public static String commandHelp() {
		String s = "";
		for(int i = 0; i < CommandParser.availableCommands.length; i++){
			Command c = CommandParser.availableCommands[i];
			s+= c.helpText() + System.lineSeparator();
		}
		return s;
		//incoca el metodo helpText() de cada subclase command
		//Este metodo es invocado por el metodo execute de la clase HelpCommand
	}
}
