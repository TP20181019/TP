package tp.p1.objects;

public class CommonZombie extends Zombie{
	private static String longName = "COMMONZOMBIE";
	private static String shortName = "Z";
	
	public CommonZombie(int x, int y) {
		super(x, y, shortName );
		setLife(5);
		setSpeed(2);
	}

	public CommonZombie() {
		super(-1, -1, shortName);
	}

	@Override
	public String toString() {
		return  new String (shortName + "["+ getLife() +"]");	
	}

	@Override
	public String toStringDebug() {
		return new String(shortName + "[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % this.getSpeed() + "]");
	}

	@Override
	public Zombie parse(String zombieName, int x, int y) {
		if(zombieName.equalsIgnoreCase(longName) || zombieName.equalsIgnoreCase(shortName))
			return new CommonZombie(x, y);
		else
			return null;
	}

}
