package tp.p1.objects;

public class Wallnut extends Plant {
	
	private static String longName = "WALLNUT";
	private static String shortName = "N";

	public Wallnut(int x, int y) {
		super(x, y, shortName);
		setCost(50);
		setHarm(0);
		setLife(10);
		
	}
	public Wallnut() {
		super(-1, -1, shortName);
	}
	@Override
	public String toString() {
		return  new String ( shortName + "["+ getLife() +"]");	
	}
	@Override
	public String toStringDebug() {
		return new String( shortName + "[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 10 + "]");
	}
	@Override
	public Plant parse(String plantName, int x, int y) {
		if(plantName.equalsIgnoreCase(longName) || plantName.equalsIgnoreCase(shortName))
			return new Wallnut(x, y);
		else
			return null;
	}
}
