package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class PrintModeCommand extends Command{
	private String mode;
	
	
	public PrintModeCommand (String mode) {
		this.mode = mode;
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
	
