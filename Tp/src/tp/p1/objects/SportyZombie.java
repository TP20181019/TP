package tp.p1.objects;

public class SportyZombie extends Zombie{

	public SportyZombie(int x, int y) {
		super(x, y, 2, "SZ");
		
	}
	
	public String  toString () {
		return  new String ("SZ["+ getLife() +"]");	
	}

}
