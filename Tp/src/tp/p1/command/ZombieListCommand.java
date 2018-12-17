package tp.p1.command;

import tp.p1.controller.Controller;
import tp.p1.controller.Game;
import tp.p1.objects.PlantFactory;
import tp.p1.objects.ZombieFactory;

public class ZombieListCommand extends NoParamsCommand{
	
	private static String cmName = "zombieList";
	private static String cmText = "zombieList:";
	private static String cmInfo = " print the list of zombies";

	public ZombieListCommand() {
		// TODO Auto-generated constructor stub
		super(cmName, cmText, cmInfo);
	}

	public void execute(Game game, Controller controller) {
		System.out.println(ZombieFactory.infoAvailableZombies());	
	}


}
