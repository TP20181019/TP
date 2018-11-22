package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;

public class AddCommand extends Command{
	
	private int x;
	private int y;
	private String plantName;
	private static String cmName = "add";
	private static String cmText = "[A]dd:";
	private static String cmInfo = " <plant> <x> <y>";
	
	
	public AddCommand() {
		super(cmName, cmText , cmInfo );
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
		game.addPlant();
		
	}
	
	public String helpText() {
		 return cmText + cmInfo;
	}

	@Override
	public Command parse(String[] commandWords, Controller controller) {
		Command cm= null;
		if (( commandWords.length==4)&& ( commandWords[0].equalsIgnoreCase("A")))
		{
			if (commandWords[1].equalsIgnoreCase("S")){
				this.plantName = "sunflower";
				}
			else if(commandWords[1].equalsIgnoreCase("P")) {
				this.plantName = "peashooter";
			}
			else if(commandWords[1].equalsIgnoreCase("C")) {
				this.plantName = "peashooter";
			}
			else if(commandWords[1].equalsIgnoreCase("N")) {
				this.plantName = "peashooter";
			}
			this.x = Integer.parseInt(commandWords[2]);
			this.y = Integer.parseInt(commandWords[3]);
		}
		return cm;
	}
}
