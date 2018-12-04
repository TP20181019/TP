package tp.p1.objects;

public class BucketheadZombie extends Zombie {

	public BucketheadZombie(int x, int y) {
		super(x, y, 8, "BZ");
	}

	public String  toString () {
		return  new String ("BZ["+ getLife() +"]");	
	}
}
