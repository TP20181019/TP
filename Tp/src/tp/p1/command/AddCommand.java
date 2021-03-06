package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;
import tp.p1.objects.PlantFactory;
import tp.p1.objects.Plant;

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
		Plant plant = PlantFactory.getPlant(plantName, x, y);
		game.addPlant(plant, x, y);
		game.update();
	}
	@Override
	public Command parse(String[] commandWords, Controller controller) {
		Command cm= null;
		if (( commandWords.length==4)&& ( commandWords[0].equalsIgnoreCase("A")))
		{
			if (commandWords[1].equalsIgnoreCase("S")){
				this.plantName = "S";
				}
			else if(commandWords[1].equalsIgnoreCase("P")) {
				this.plantName = "P";
			}
			else if(commandWords[1].equalsIgnoreCase("C")) {
				this.plantName = "C";
			}
			else if(commandWords[1].equalsIgnoreCase("N")) {
				this.plantName = "N";
			}
			else
				return null;
			this.x = Integer.parseInt(commandWords[2]);
			this.y = Integer.parseInt(commandWords[3]);
			cm = new AddCommand(x, y, plantName);
		}
		return cm;
	}
}
