package tp.p1.objects;

public class Cherrybomb extends Plant {
	private static String longName = "CHERRYBOMB";
	private static String shortName = "C";
	
	public Cherrybomb(int x, int y) {
		super(x, y, shortName);
		setCost(50);
		setHarm(10);
		setLife(2);
		
	}
	public Cherrybomb() {
		this(-1, -1);
	}

	public String  toString () {
		return  new String (shortName + "["+ getLife() +"]");	
	}
	@Override
	public String toStringDebug() {
		return new String( shortName + "[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 2 + "]");
	}
	@Override
	public Plant parse(String plantName, int x, int y) {
		if(plantName.equalsIgnoreCase(longName) || plantName.equalsIgnoreCase(shortName))
			return new Cherrybomb(x, y);
		else
			return null;
	}
}
