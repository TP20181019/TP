package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class UpdateCommand extends Command {

	public UpdateCommand(String commandText, String commandTextMsg, String helpTextMsg) {
		// TODO Auto-gerated constructor stub
		super(commandText, commandTextMsg,helpTextMsg);
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
