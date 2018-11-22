package tp.p1.objects;

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
		Plants plant = null;
		x = plant.getX();
		y = plant.getY();
		switch (plantName) {
		case P: return new Peashooter(x, y);
		case S: return new Sunflower(x,y);
		case C: return new Cherrybomb(x,y);
		case N: return new Wallnut(x,y);
		default: return null;
		}
		
	}
	
	private static Plants[] availablePlants = {
			
			new Sunflower (x, y),
			new Peashooter(x, y),
			new Cherrybomb(x, y),
			new Wallnut(x, y),
	};
	
	public static Plants getPlant(String plantName){
		return null;
			// sera usado por el comando addPlant 
			}
	public static String infoAvailablePlants(){
		return null;
		
	
	}
	public static String listOfAvilablePlants() {
		return null;
			//lista de plantas disponibles que se puede preguntar
			//este metodo sera usado por el comando listComand
			}//*/
	public static Plants[] getAvailablePlants() {
		return availablePlants;
		
	}
	
}
	
