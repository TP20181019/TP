package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class AddCommand extends Command{
	
	private int x;
	private int y;
	private String plantName;
	private static String text = "[A]dd <plant> <x> <y>:";
	private static String help = " adds a plant in position x, y.";
	
	
	public AddCommand() {
		super("add", text , help );
	}
	public AddCommand(int x, int y, String plantName)
	{
		this();
		this.x = x;
		this.y = y;
		this.plantName = plantName;
		
	}
	
	@Override
	public void execute(Game game, Controller controller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Command parse(String[] commandWords, Controller controller) {
		Command cm= null;
		if (( commandWords.length==4)&& ( commandWords[0].equalsIgnoreCase("A")))
		{
			if (commandWords[1].equalsIgnoreCase("S")){
				this.plantName = "sunflower";
				}
			
		}
		return cm;
	}
}
