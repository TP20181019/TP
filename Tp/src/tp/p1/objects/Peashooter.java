
package tp.p1.objects;

public class Peashooter extends Plant{
	private static String longName = "PEASHOOTER";
	private static String shortName = "P";
	
	public Peashooter (int x, int y) {
		super (x, y, "P");
		setCost(50);
		setHarm(1);	
		setLife(3);
	}
	
	public Peashooter() {
		this(-1, -1);
	}
	public boolean aparecer (){
		return false;		
	}
	
	public String  toString () {
		return  new String (shortName + "["+ getLife() +"]");	
	}

	@Override
	public String toStringDebug() {
		return new String(shortName + "[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 1 + "]");
	}

	@Override
	public Plant parse(String plantName, int x, int y) {
		if(plantName.equalsIgnoreCase(longName) || plantName.equalsIgnoreCase(shortName))
			return new Peashooter(x, y);
		else
			return null;
	}
}
