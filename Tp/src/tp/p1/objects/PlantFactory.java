package tp.p1.objects;

import tp.p1.command.Command;
import tp.p1.command.CommandParser;

public class PlantFactory {
	
	public final static String P = "Peashooter";
	public final static String S = "Sunflower";
	public final static String C = "Cherrybomb";
	public final static String N = "Wallnut";
	private static int x;
	private static int y;
	
	public PlantFactory() {
		// TODO Auto-generated constructor stub
	}
	public Plants createPlant ( String plantName ) {
		switch (plantName) {
		case P: return new Peashooter(x, y);
		case S: return new Sunflower(x,y);
		case C: return new Cherrybomb(x,y);
		case N: return new Wallnut(x,y);
		default: return null;
		}
		
	}
	
	private static Plants[] availablePlants = {
			
			new Sunflower(),
			new Peashooter(),
			new Cherrybomb(),
			new Wallnut(),
	};
	
	public static Plants getPlant(String plantName){
		
		
		return null;
			// sera usado por el comando addPlant 
	}
	public static String infoAvailablePlants(){
		String s = "";
		for(int i = 0; i < PlantFactory.availablePlants.length; i++){
			Plants p = PlantFactory.availablePlants[i];
			s+= p.getInfo() + System.lineSeparator();
		}
		return s;
	}
	
}
	
