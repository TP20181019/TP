package tp.p1.objects;

public class PlantFactory {
	
	public final static String P;
	public final static String S;
	public final static String C;
	public final static String N;
	
	public PlantFactory() {
		// TODO Auto-generated constructor stub
	}
	public Plants createPlant ( String namePlant ) {
		
		switch (namePlant) {
		//case P: return new Peashooter(1, 2);break;
		//case S: return new Sunflower(1, 2);break;
		//case C: return new PetaCereza();break;
		//case N: return new Nuez();break;
		default: return null;
		}
		return null;
		
	}
	
	private static Plants[] availablePlants = {
			
			new Sunflower();
			new Peashooter();
			//new PetaCereza();
			//new Nuez();
	};
	
	public static Plants getPlant(String plantName){
			// sera usado por el comando addPlant 
			}
	public static String infoAvailablePlants(){
		
	
	}
	public static String listOfAvilablePlants() {
			//lista de plantas disponibles que se puede preguntar
			//este metodo sera usado por el comando listComand
			}*/
	
	
}
