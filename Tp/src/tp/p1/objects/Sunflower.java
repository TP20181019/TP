
package tp.p1.objects;


public class Sunflower extends Plant{
	private static String longName = "SUNFLOWER";
	private static String shortName = "S";

	public Sunflower(int x, int y) {
		super(x, y, shortName);
		setCost(20);
		setHarm(0);
		setLife(1);
	}
	public Sunflower() {
		this(-1, -1);
	}
	public String  toString() {
		String s = shortName + "["+ getLife() +"]";
		return  s;	
	}
	@Override
	public String toStringDebug() {
		return new String(shortName + "[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 3 + "]");
	}
	@Override
	public Plant parse(String plantName, int x, int y) {
		if(plantName.equalsIgnoreCase(longName) || plantName.equalsIgnoreCase(shortName))
			return new Sunflower(x, y);
		else
			return null;
	}
}

