package tp.p1.objects;

public class PlantFactory {
	
	public final static String P = "Peashooter";
	public final static String S = "Sunflower";
	public final static String C = "Cherrybomb";
	public final static String N = "Wallnut";
	
	public PlantFactory() {
		// TODO Auto-generated constructor stub
	}
	public Plants createPlant ( String plantName ) {
		
		switch (plantName) {
		case P: return new Peashooter(0, 0);
		case S: return new Sunflower(0, 0);
		case C: return new Cherrybomb(0, 0);
		case N: return new Wallnut(0, 0);
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
	
