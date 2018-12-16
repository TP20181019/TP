package tp.p1.objects;

public class BucketheadZombie extends Zombie {
	private static String longName = "BUCKETHEADZOMBIE";
	private static String shortName = "W";
	private static int walk = 4;
	
	public BucketheadZombie(int x, int y) {
		super(x, y, shortName);
		setHarm(1);
		setLife(8);	
	}

	public BucketheadZombie() {
		super(-1, -1, shortName);
	}

	public String  toString () {
		return  new String (shortName + "["+ getLife() +"]");	
	}

	@Override
	public String toStringDebug() {
		return new String(shortName + "[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % walk + "]");
	}

	@Override
	public Zombie parse(String zombieName, int x, int y) {
		if(zombieName.equalsIgnoreCase(longName) || zombieName.equalsIgnoreCase(shortName))
			return new BucketheadZombie(x, y);
		else
			return null;
	}
}
