package tp.p1.objects;

public class SportyZombie extends Zombie{
	private static String longName = "SPORTYZOMBIE";
	private static String shortName = "X";

	public SportyZombie(int x, int y) {
		super(x, y, shortName);
		setLife(2);	
		setSpeed(1);
	}
	
	public SportyZombie() {
		super(-1, -1, shortName);
	}


	public String  toString () {
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
			return new SportyZombie(x, y);
		else
			return null;
	}

	

}
