package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class NoneCommand extends Command{

	public NoneCommand(String commandText, String commandTextMsg, String helpTextMsg) {
		super(commandText, commandTextMsg, helpTextMsg);
		// TODO Auto-generated constructor stub
	}
	
	public NoneCommand() {
		super("", "", "");
		}

	@Override
	public void execute(Game game, Controller controller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Command parse(String[] commandWords, Controller controller) {
		// TODO Auto-generated method stub
		return null;
	}

}
