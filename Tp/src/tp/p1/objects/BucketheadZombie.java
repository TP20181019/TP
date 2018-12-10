package tp.p1.objects;

public class BucketheadZombie extends Zombie {

	public BucketheadZombie(int x, int y) {
		super(x, y, 8, "W");
	}

	public String  toString () {
		return  new String ("W["+ getLife() +"]");	
	}

	@Override
	public String toStringDebug() {
		return new String("W[l:" + getLife()+ ",x:" + getX() + 
				",y:" + getY() + ",t:" + getCycle() % 4 + "]");
	}
}
