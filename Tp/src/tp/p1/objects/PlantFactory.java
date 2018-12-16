package tp.p1.objects;


public class PlantFactory {
	
	private static Plant[] availablePlants = {
			
			new Sunflower(),
			new Peashooter(),
			new Cherrybomb(),
			new Wallnut(),
	};
	
	public static Plant getPlant(String plantName, int x, int y){
		Plant p = null;
		for (Plant plant:availablePlants){
			p= plant.parse(plantName, x, y);
			if (p!=null) 
				return p;
		}
		return p;
	}
	
	public static String infoAvailablePlants(){
		String s = "";
		for(int i = 0; i < PlantFactory.availablePlants.length; i++){
			Plant p = PlantFactory.availablePlants[i];
			s+= p.getInfo() + System.lineSeparator();
		}
		return s;
	}
	
}
	
